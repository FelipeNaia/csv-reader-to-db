package com.br.naia.cadastropessoa.service;

import com.br.naia.cadastropessoa.entity.ContatoEntity;
import com.br.naia.cadastropessoa.exception.EmailInvalidoException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.List;

class ContatoServiceTest {

    @InjectMocks
    private ContatoService contatoService;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void deveValidarSemProblemas() {
        List<ContatoEntity> contatoEntities = List.of(new ContatoEntity(1L, "Felipe Naia", "67981755451", "fbruchn@gmail.com", null));
        contatoService.validarContatos(contatoEntities);
    }

    @Test
    void deveFalharEmCampoNulo() {
        List<ContatoEntity> contatoEntities = List.of(new ContatoEntity(1L, null, "67981755451", "fbruchn@gmail.com", null));
        Assertions.assertThrows(IllegalArgumentException.class, () -> contatoService.validarContatos(contatoEntities));
    }

    @Test
    void deveFalharComEmailInvalido() {
        List<ContatoEntity> contatoEntities = List.of(new ContatoEntity(1L, "Felipe Naia", "67981755451", "fbruchngmail.com", null));
        Assertions.assertThrows(EmailInvalidoException.class, () -> contatoService.validarContatos(contatoEntities));
    }

}