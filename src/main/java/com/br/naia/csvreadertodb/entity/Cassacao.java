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
@Table(name = "CASSACAO", schema = "ELEICAO")
@SequenceGenerator(name = "SEQ_CASSACAO", sequenceName = "ELEICAO.SEQ_CASSACAO", allocationSize = 1)
public class Cassacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_CASSACAO")
    @Column(name = "CASSACAO_ID")
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

@Column(name = "DS_MOTIVO_CASSACAO")
    @CsvBindByName(column = "DS_MOTIVO_CASSACAO")
    private String DS_MOTIVO_CASSACAO;
            



//DT_GERACAO
//HH_GERACAO
//ANO_ELEICAO
//CD_TIPO_ELEICAO
//NM_TIPO_ELEICAO
//CD_ELEICAO
//DS_ELEICAO
//SG_UF
//SG_UE
//NM_UE
//SQ_CANDIDATO
//DS_MOTIVO_CASSACAO
}
