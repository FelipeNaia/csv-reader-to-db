package com.br.naia.csvreadertodb.repository;

import com.br.naia.csvreadertodb.entity.Coligacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColigacaoRepository extends JpaRepository<Coligacao, Long> {
}
