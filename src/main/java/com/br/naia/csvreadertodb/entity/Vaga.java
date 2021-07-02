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
@Table(name = "VAGA", schema = "ELEICAO")
@SequenceGenerator(name = "SEQ_VAGA", sequenceName = "ELEICAO.SEQ_VAGA", allocationSize = 1)
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_VAGA")
    @Column(name = "VAGA_ID")
    private Long id;
   
    @Column( name = "DT_GERACAO")
    @CsvBindByName(column = "DT_GERACAO")
    private String DT_GERACAO;

    @Column( name = "HH_GERACAO")
    @CsvBindByName(column = "HH_GERACAO")
    private String HH_GERACAO;

    @Column( name = "ANO_ELEICAO")
    @CsvBindByName(column = "ANO_ELEICAO")
    private String ANO_ELEICAO;

    @Column( name = "CD_TIPO_ELEICAO")
    @CsvBindByName(column = "CD_TIPO_ELEICAO")
    private String CD_TIPO_ELEICAO;

    @Column( name = "NM_TIPO_ELEICAO")
    @CsvBindByName(column = "NM_TIPO_ELEICAO")
    private String NM_TIPO_ELEICAO;

    @Column( name = "CD_ELEICAO")
    @CsvBindByName(column = "CD_ELEICAO")
    private String CD_ELEICAO;

    @Column( name = "DS_ELEICAO")
    @CsvBindByName(column = "DS_ELEICAO")
    private String DS_ELEICAO;

    @Column( name = "DT_ELEICAO")
    @CsvBindByName(column = "DT_ELEICAO")
    private String DT_ELEICAO;

    @Column( name = "DT_POSSE")
    @CsvBindByName(column = "DT_POSSE")
    private String DT_POSSE;

    @Column( name = "SG_UF")
    @CsvBindByName(column = "SG_UF")
    private String SG_UF;

    @Column( name = "SG_UE")
    @CsvBindByName(column = "SG_UE")
    private String SG_UE;

    @Column( name = "NM_UE")
    @CsvBindByName(column = "NM_UE")
    private String NM_UE;

    @Column( name = "CD_CARGO")
    @CsvBindByName(column = "CD_CARGO")
    private String CD_CARGO;

    @Column( name = "DS_CARGO")
    @CsvBindByName(column = "DS_CARGO")
    private String DS_CARGO;

    @Column( name = "QT_VAGAS")
    @CsvBindByName(column = "QT_VAGAS")
    private String QT_VAGAS;


//DT_GERACAO
//HH_GERACAO
//ANO_ELEICAO
//CD_TIPO_ELEICAO
//NM_TIPO_ELEICAO
//CD_ELEICAO
//DS_ELEICAO
//DT_ELEICAO
//DT_POSSE
//SG_UF
//SG_UE
//NM_UE
//CD_CARGO
//DS_CARGO
//QT_VAGAS
}
