package com.br.naia.csvreadertodb.service;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import com.br.naia.csvreadertodb.dataprovider.PessoaDataProvider;
import com.br.naia.csvreadertodb.dto.PageDto;
import com.br.naia.csvreadertodb.dto.PessoaDto;
import com.br.naia.csvreadertodb.entity.ContatoEntity;
import com.br.naia.csvreadertodb.entity.PessoaEntity;
import com.br.naia.csvreadertodb.exception.CpfInvalidoException;
import com.br.naia.csvreadertodb.translator.PessoaTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaTranslator pessoaTranslator;

    @Autowired
    private PessoaDataProvider pessoaDataProvider;

    @Autowired
    private ContatoService contatoService;

    private CPFValidator cpfValidator = new CPFValidator();

    public PessoaDto salvar(PessoaDto pessoaDto) {
        PessoaEntity pessoaEntity = pessoaTranslator.fromDto(pessoaDto);
        validarPessoa(pessoaEntity);
        return pessoaTranslator.toDto(pessoaDataProvider.salvar(pessoaEntity));
    }

    public void remover(Long id) {
        Assert.notNull(id, "Deve ser informada uma pessoa a ser removida");
        pessoaDataProvider.remover(id);
    }

    private void validarPessoa(PessoaEntity pessoaEntity) {
        Assert.notNull(pessoaEntity, "É necessário preencher as informações da pessoa");
        validarCPF(pessoaEntity.getCpf());
        validarDataNascimento(pessoaEntity.getNascimento());
        validarContatos(pessoaEntity.getContatos());
    }

    private void validarCPF(String cpf) {
        try {
            cpfValidator.assertValid(cpf);
        } catch (InvalidStateException e) {
            throw new CpfInvalidoException();
        }
    }

    private void validarDataNascimento(LocalDateTime nascimento) {
        Assert.isTrue(LocalDateTime.now().isAfter(nascimento), "Data de nascimento inválida");
    }

    private void validarContatos(List<ContatoEntity> contatoEntities) {
        contatoService.validarContatos(contatoEntities);
    }

    public PessoaDto buscar(Long id) {
        return pessoaTranslator.toDto(pessoaDataProvider.buscar(id));
    }

    public PageDto<PessoaDto> buscarLista(PageRequest pageRequest) {
        Page<PessoaEntity> pessoaPage = pessoaDataProvider.buscarPaginado(pageRequest);
        return new PageDto<>(pessoaTranslator.toDtoList(pessoaPage.getContent()), pessoaPage.getTotalElements(), pessoaPage.getTotalPages());
    }
}
