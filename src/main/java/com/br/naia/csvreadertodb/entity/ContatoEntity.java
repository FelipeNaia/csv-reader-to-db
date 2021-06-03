package com.br.naia.csvreadertodb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CONTATO", schema = "CADASTRO_PESSOA")
@SequenceGenerator(name = "SEQ_CONTATO", sequenceName = "CADASTRO_PESSOA.SEQ_CONTATO", allocationSize = 1)
public class ContatoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_CONTATO")
    @Column(name = "CO_ID")
    private Long id;

    @Column(name = "CO_NOME")
    private String nome;

    @Column(name = "CO_TELEFONE", length = 11)
    private String telefone;

    @Column(name = "CO_EMAIL")
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PE_ID", referencedColumnName = "PE_ID")
    private PessoaEntity pessoaEntity;
}
