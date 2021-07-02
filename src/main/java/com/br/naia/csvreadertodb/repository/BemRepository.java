package com.br.naia.csvreadertodb.repository;

import com.br.naia.csvreadertodb.entity.Bem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BemRepository extends JpaRepository<Bem, Long> {
}
