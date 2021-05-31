package com.br.naia.cadastropessoa.dataprovider;

import com.br.naia.cadastropessoa.entity.PessoaEntity;
import com.br.naia.cadastropessoa.exception.PessoaNaoEncontradaException;
import com.br.naia.cadastropessoa.repository.ContatoRepository;
import com.br.naia.cadastropessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PessoaDataProvider {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private ContatoRepository contatoRepository;

    public PessoaEntity salvar(PessoaEntity pessoaEntity) {
        PessoaEntity pessoaSalva = pessoaRepository.save(pessoaEntity);
        pessoaSalva.getContatos().forEach(contatoEntity -> contatoEntity.setPessoaEntity(pessoaSalva));
        pessoaSalva.setContatos(contatoRepository.saveAll(pessoaSalva.getContatos()));
        return pessoaSalva;
    }

    public PessoaEntity buscar(Long id) {
        Optional<PessoaEntity> pessoaEntityOptional = pessoaRepository.findById(id);
        pessoaEntityOptional.ifPresent(pessoaEntity -> pessoaEntity.setContatos(contatoRepository.findAllByPessoaEntity_Id(pessoaEntity.getId())));

        return pessoaEntityOptional.orElseThrow(PessoaNaoEncontradaException::new);
    }

    public Page<PessoaEntity> buscarPaginado(Pageable pageable) {
        return pessoaRepository.findAll(pageable);
    }
}
