package com.br.naia.cadastropessoa.dataprovider;

import com.br.naia.cadastropessoa.entity.ContatoEntity;
import com.br.naia.cadastropessoa.entity.PessoaEntity;
import com.br.naia.cadastropessoa.repository.ContatoRepository;
import com.br.naia.cadastropessoa.repository.PessoaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

public class PessoaDataProviderTest {

    @Mock
    private PessoaRepository pessoaRepository;

    @Mock
    private ContatoRepository contatoRepository;

    @InjectMocks
    private PessoaDataProvider pessoaDataProvider;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void salvarPessoaSemErros() {
        PessoaEntity pessoaEntity = mock(PessoaEntity.class);
        List<ContatoEntity> contatoEntities = List.of(mock(ContatoEntity.class));

        Mockito.when(pessoaEntity.getContatos()).thenReturn(contatoEntities);
        Mockito.when(pessoaRepository.save(pessoaEntity)).thenReturn(pessoaEntity);

        pessoaDataProvider.salvar(pessoaEntity);
        verify(pessoaRepository).save(pessoaEntity);
        verify(contatoRepository).saveAll(contatoEntities);
    }

    @Test
    public void deletarPeloId() {
        Long id = 1L;

        pessoaDataProvider.remover(id);
        verify(pessoaRepository, times(1)).deleteById(id);
        verify(contatoRepository, times(1)).deleteAllByPessoaEntity_Id(id);
    }

    @Test
    public void buscarPessoaComContatos() {
        Long id = 1L;
        PessoaEntity pessoaEntity = mock(PessoaEntity.class);
        when(pessoaEntity.getId()).thenReturn(id);

        List<ContatoEntity> contatoEntities = List.of(mock(ContatoEntity.class));
        when(pessoaRepository.findById(id)).thenReturn(Optional.of(pessoaEntity));
        when(contatoRepository.findAllByPessoaEntity_Id(id)).thenReturn(contatoEntities);

        pessoaDataProvider.buscar(id);
        verify(pessoaRepository, times(1)).findById(id);
        verify(contatoRepository, times(1)).findAllByPessoaEntity_Id(id);
        verify(pessoaEntity, times(1)).setContatos(contatoEntities);
    }

}