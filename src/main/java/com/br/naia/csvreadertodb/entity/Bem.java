package com.br.naia.csvreadertodb.entity;

import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "BEM", schema = "ELEICAO")
@SequenceGenerator(name = "SEQ_BEM", sequenceName = "ELEICAO.SEQ_BEM", allocationSize = 1)
public class Bem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_BEM")
    @Column(name = "BEM_ID")
    private Long id;

    @Column(name = "DT_GERACAO")
    @CsvBindByName(column = "DT_GERACAO")
    private String DT_GERACAO;

    @Column(name = "HH_GERACAO")
    @CsvBindByName(column = "HH_GERACAO")
    private String HH_GERACAO;

    @Column(name = "ANO_ELEICAO")
    @CsvBindByName(column = "ANO_ELEICAO")
    private String ANO_ELEICAO;

    @Column(name = "CD_TIPO_ELEICAO")
    @CsvBindByName(column = "CD_TIPO_ELEICAO")
    private String CD_TIPO_ELEICAO;

    @Column(name = "NM_TIPO_ELEICAO")
    @CsvBindByName(column = "NM_TIPO_ELEICAO")
    private String NM_TIPO_ELEICAO;

    @Column(name = "CD_ELEICAO")
    @CsvBindByName(column = "CD_ELEICAO")
    private String CD_ELEICAO;

    @Column(name = "DS_ELEICAO")
    @CsvBindByName(column = "DS_ELEICAO")
    private String DS_ELEICAO;

    @Column(name = "DT_ELEICAO")
    @CsvBindByName(column = "DT_ELEICAO")
    private String DT_ELEICAO;

    @Column(name = "SG_UF")
    @CsvBindByName(column = "SG_UF")
    private String SG_UF;

    @Column(name = "SG_UE")
    @CsvBindByName(column = "SG_UE")
    private String SG_UE;

    @Column(name = "NM_UE")
    @CsvBindByName(column = "NM_UE")
    private String NM_UE;

    @Column(name = "SQ_CANDIDATO")
    @CsvBindByName(column = "SQ_CANDIDATO")
    private String SQ_CANDIDATO;

    @Column(name = "NR_ORDEM_CANDIDATO")
    @CsvBindByName(column = "NR_ORDEM_CANDIDATO")
    private String NR_ORDEM_CANDIDATO;

    @Column(name = "CD_TIPO_BEM_CANDIDATO")
    @CsvBindByName(column = "CD_TIPO_BEM_CANDIDATO")
    private String CD_TIPO_BEM_CANDIDATO;

    @Column(name = "DS_TIPO_BEM_CANDIDATO")
    @CsvBindByName(column = "DS_TIPO_BEM_CANDIDATO")
    private String DS_TIPO_BEM_CANDIDATO;

    @Column(name = "DS_BEM_CANDIDATO")
    @CsvBindByName(column = "DS_BEM_CANDIDATO")
    private String DS_BEM_CANDIDATO;

    @Column(name = "VR_BEM_CANDIDATO")
    @CsvBindByName(column = "VR_BEM_CANDIDATO")
    private String VR_BEM_CANDIDATO;

    @Column(name = "DT_ULTIMA_ATUALIZACAO")
    @CsvBindByName(column = "DT_ULTIMA_ATUALIZACAO")
    private String DT_ULTIMA_ATUALIZACAO;

    @Column(name = "HH_ULTIMA_ATUALIZACA")
    @CsvBindByName(column = "HH_ULTIMA_ATUALIZACA")
    private String HH_ULTIMA_ATUALIZACA;
    
//DT_GERACAO
//HH_GERACAO
//ANO_ELEICAO
//CD_TIPO_ELEICAO
//NM_TIPO_ELEICAO
//CD_ELEICAO
//DS_ELEICAO
//DT_ELEICAO
//SG_UF
//SG_UE
//NM_UE
//SQ_CANDIDATO
//NR_ORDEM_CANDIDATO
//CD_TIPO_BEM_CANDIDATO
//DS_TIPO_BEM_CANDIDATO
//DS_BEM_CANDIDATO
//VR_BEM_CANDIDATO
//DT_ULTIMA_ATUALIZACAO
//HH_ULTIMA_ATUALIZACAO
}
