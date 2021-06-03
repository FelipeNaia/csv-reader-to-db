package com.br.naia.csvreadertodb.repository;

import com.br.naia.csvreadertodb.entity.ContatoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContatoRepository extends JpaRepository<ContatoEntity, Long> {
    List<ContatoEntity> findAllByPessoaEntity_Id(Long pessoaId);

    void deleteAllByPessoaEntity_Id(Long id);
}
