package com.br.naia.cadastropessoa.dataprovider;

import com.br.naia.cadastropessoa.entity.PessoaEntity;
import com.br.naia.cadastropessoa.exception.PessoaNaoEncontradaException;
import com.br.naia.cadastropessoa.repository.ContatoRepository;
import com.br.naia.cadastropessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Component
public class PessoaDataProvider {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private ContatoRepository contatoRepository;

    @Transactional
    public PessoaEntity salvar(PessoaEntity pessoaEntity) {
        PessoaEntity pessoaSalva = pessoaRepository.save(pessoaEntity);
        pessoaEntity.getContatos().forEach(contatoEntity -> contatoEntity.setPessoaEntity(pessoaSalva));
        pessoaSalva.setContatos(contatoRepository.saveAll(pessoaEntity.getContatos()));
        return pessoaSalva;
    }

    @Transactional
    public void remover(Long id) {
        contatoRepository.deleteAllByPessoaEntity_Id(id);
        pessoaRepository.deleteById(id);
    }

    public PessoaEntity buscar(Long id) {
        Optional<PessoaEntity> pessoaEntityOptional = pessoaRepository.findById(id);

        pessoaEntityOptional.ifPresent(pessoaEntity -> pessoaEntity.setContatos(contatoRepository.findAllByPessoaEntity_Id(pessoaEntity.getId())));

        return pessoaEntityOptional.orElseThrow(PessoaNaoEncontradaException::new);
    }

    public Page<PessoaEntity> buscarPaginado(PageRequest pageRequest) {
        return pessoaRepository.findAll(pageRequest);
    }
}
