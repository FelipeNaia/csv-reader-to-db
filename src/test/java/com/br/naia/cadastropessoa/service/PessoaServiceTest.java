package com.br.naia.cadastropessoa.service;

import com.br.naia.cadastropessoa.dataprovider.PessoaDataProvider;
import com.br.naia.cadastropessoa.dto.ContatoDto;
import com.br.naia.cadastropessoa.dto.PessoaDto;
import com.br.naia.cadastropessoa.entity.ContatoEntity;
import com.br.naia.cadastropessoa.entity.PessoaEntity;
import com.br.naia.cadastropessoa.exception.CpfInvalidoException;
import com.br.naia.cadastropessoa.exception.EmailInvalidoException;
import com.br.naia.cadastropessoa.translator.PessoaTranslator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class PessoaServiceTest {

    @Mock
    private PessoaTranslator pessoaTranslator;

    @Mock
    private PessoaDataProvider pessoaDataProvider;

    @Mock
    private ContatoService contatoService;

    @InjectMocks
    private PessoaService pessoaService;

    @Captor
    private ArgumentCaptor<PessoaEntity> pessoaEntityArgumentCaptor;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void deveValidarSemProblemas() {
        PessoaDto pessoaDto = getPessoaDto();
        when(pessoaTranslator.fromDto(pessoaDto)).thenReturn(getPessoaEntity());

        pessoaService.salvar(pessoaDto);

        verify(pessoaDataProvider).salvar(pessoaEntityArgumentCaptor.capture());
        PessoaEntity pessoaEntityArgumentCaptorValue = pessoaEntityArgumentCaptor.getValue();

        assertEquals("Felipe Naia", pessoaEntityArgumentCaptorValue.getNome());
        assertEquals("05661733100", pessoaEntityArgumentCaptorValue.getCpf());
    }

    @Test
    void deveFalharAoValidarCpf() {
        PessoaDto pessoaDto = getPessoaDto();
        PessoaEntity pessoaEntity = getPessoaEntity();

        pessoaEntity.setCpf("12312312312");
        when(pessoaTranslator.fromDto(pessoaDto)).thenReturn(pessoaEntity);

        Assertions.assertThrows(CpfInvalidoException.class, () -> pessoaService.salvar(pessoaDto));
    }

    @Test
    void deveFalharAoValidarDataDeNascimento() {
        PessoaDto pessoaDto = getPessoaDto();
        PessoaEntity pessoaEntity = getPessoaEntity();

        pessoaEntity.setNascimento(LocalDateTime.MAX);
        when(pessoaTranslator.fromDto(pessoaDto)).thenReturn(pessoaEntity);

        Assertions.assertThrows(IllegalArgumentException.class, () -> pessoaService.salvar(pessoaDto));
    }

    @Test
    void deveFalharAoValidarContatos() {
        PessoaDto pessoaDto = getPessoaDto();
        PessoaEntity pessoaEntity = getPessoaEntity();

        when(pessoaTranslator.fromDto(pessoaDto)).thenReturn(pessoaEntity);
        doThrow(new EmailInvalidoException()).when(contatoService).validarContatos(any());

        Assertions.assertThrows(EmailInvalidoException.class, () -> pessoaService.salvar(pessoaDto));
    }

    @Test
    void deveFalharAoRemoverSemId() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> pessoaService.remover(null));
    }

    @Test
    void deveRemoverSemErros() {
        Long id = 1L;
        pessoaService.remover(id);
        verify(pessoaDataProvider).remover(id);
    }

    @Test
    void deveBuscarSemErros() {
        Long id = 1L;
        pessoaService.buscar(id);
        verify(pessoaDataProvider).buscar(id);
    }

    @Test
    void deveBuscarPaginadoSemErros() {
        PageRequest pageRequest = PageRequest.of(1, 1);
        when(pessoaDataProvider.buscarPaginado(pageRequest)).thenReturn(Page.empty());
        pessoaService.buscarLista(pageRequest);
        verify(pessoaDataProvider).buscarPaginado(any());
    }

    private PessoaDto getPessoaDto() {
        return new PessoaDto(1L, "Felipe Naia", "05661733100", LocalDateTime.MIN.toString(), List.of(new ContatoDto()));
    }

    private PessoaEntity getPessoaEntity() {
        return new PessoaEntity(1L, "Felipe Naia", "05661733100", LocalDateTime.MIN, List.of(new ContatoEntity()));
    }
}