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
@Table(name = "COLIGACAO", schema = "ELEICAO")
@SequenceGenerator(name = "SEQ_COLIGACAO", sequenceName = "ELEICAO.SEQ_COLIGACAO", allocationSize = 1)
public class Coligacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_COLIGACAO")
    @Column(name = "COLIGACAO_ID")
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
    

    @Column( name = "NR_TURNO")
    @CsvBindByName(column = "NR_TURNO")
    private String NR_TURNO;
    

    @Column( name = "CD_ELEICAO")
    @CsvBindByName(column = "CD_ELEICAO")
    private String CD_ELEICAO;
    

    @Column( name = "DS_ELEICAO")
    @CsvBindByName(column = "DS_ELEICAO")
    private String DS_ELEICAO;
    

    @Column( name = "DT_ELEICAO")
    @CsvBindByName(column = "DT_ELEICAO")
    private String DT_ELEICAO;
    

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
    

    @Column( name = "TP_AGREMIACAO")
    @CsvBindByName(column = "TP_AGREMIACAO")
    private String TP_AGREMIACAO;
    

    @Column( name = "NR_PARTIDO")
    @CsvBindByName(column = "NR_PARTIDO")
    private String NR_PARTIDO;
    

    @Column( name = "SG_PARTIDO")
    @CsvBindByName(column = "SG_PARTIDO")
    private String SG_PARTIDO;
    

    @Column( name = "NM_PARTIDO")
    @CsvBindByName(column = "NM_PARTIDO")
    private String NM_PARTIDO;
    

    @Column( name = "SQ_COLIGACAO")
    @CsvBindByName(column = "SQ_COLIGACAO")
    private String SQ_COLIGACAO;
    

    @Column( name = "NM_COLIGACAO")
    @CsvBindByName(column = "NM_COLIGACAO")
    private String NM_COLIGACAO;
    

    @Column( name = "DS_COMPOSICAO_COLIGACAO")
    @CsvBindByName(column = "DS_COMPOSICAO_COLIGACAO")
    private String DS_COMPOSICAO_COLIGACAO;
    

    @Column( name = "CD_SITUACAO_LEGENDA")
    @CsvBindByName(column = "CD_SITUACAO_LEGENDA")
    private String CD_SITUACAO_LEGENDA;
    

    @Column( name = "DS_SITUACAO")
    @CsvBindByName(column = "DS_SITUACAO")
    private String DS_SITUACAO;
    
    
    

   
   
   
//DT_GERACAO
//HH_GERACAO
//ANO_ELEICAO
//CD_TIPO_ELEICAO
//NM_TIPO_ELEICAO
//NR_TURNO
//CD_ELEICAO
//DS_ELEICAO
//DT_ELEICAO
//SG_UF
//SG_UE
//NM_UE
//CD_CARGO
//DS_CARGO
//TP_AGREMIACAO
//NR_PARTIDO
//SG_PARTIDO
//NM_PARTIDO
//SQ_COLIGACAO
//NM_COLIGACAO
//DS_COMPOSICAO_COLIGACAO
//CD_SITUACAO_LEGENDA
//DS_SITUACAO
}
