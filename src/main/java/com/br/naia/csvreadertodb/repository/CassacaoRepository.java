package com.br.naia.csvreadertodb.repository;

import com.br.naia.csvreadertodb.entity.Cassacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CassacaoRepository extends JpaRepository<Cassacao, Long> {
}
