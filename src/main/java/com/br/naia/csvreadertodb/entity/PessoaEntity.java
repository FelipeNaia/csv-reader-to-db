package com.br.naia.csvreadertodb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PESSOA", schema = "CADASTRO_PESSOA")
@SequenceGenerator(name = "SEQ_PESSOA", sequenceName = "CADASTRO_PESSOA.SEQ_PESSOA", allocationSize = 1)
public class PessoaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_PESSOA")
    @Column(name = "PE_ID")
    private Long id;

    @Column(name = "PE_NOME")
    private String nome;

    @Column(name = "PE_CPF", length = 11)
    private String cpf;

    @Column(name = "PE_DATA_NASCIMENTO")
    private LocalDateTime nascimento;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoaEntity")
    private List<ContatoEntity> contatos;
}
