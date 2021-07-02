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
@Table(name = "CANDIDATO", schema = "ELEICAO")
@SequenceGenerator(name = "SEQ_CANDIDATO", sequenceName = "ELEICAO.SEQ_CANDIDATO", allocationSize = 1)
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_CANDIDATO")
    @Column(name = "CANDIDATO_ID")
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

    @Column(name = "NR_TURNO")
    @CsvBindByName(column = "NR_TURNO")
    private String NR_TURNO;

    @Column(name = "CD_ELEICAO")
    @CsvBindByName(column = "CD_ELEICAO")
    private String CD_ELEICAO;

    @Column(name = "DS_ELEICAO")
    @CsvBindByName(column = "DS_ELEICAO")
    private String DS_ELEICAO;

    @Column(name = "DT_ELEICAO")
    @CsvBindByName(column = "DT_ELEICAO")
    private String DT_ELEICAO;

    @Column(name = "TP_ABRANGENCIA")
    @CsvBindByName(column = "TP_ABRANGENCIA")
    private String TP_ABRANGENCIA;

    @Column(name = "SG_UF")
    @CsvBindByName(column = "SG_UF")
    private String SG_UF;

    @Column(name = "SG_UE")
    @CsvBindByName(column = "SG_UE")
    private String SG_UE;

    @Column(name = "NM_UE")
    @CsvBindByName(column = "NM_UE")
    private String NM_UE;

    @Column(name = "CD_CARGO")
    @CsvBindByName(column = "CD_CARGO")
    private String CD_CARGO;

    @Column(name = "DS_CARGO")
    @CsvBindByName(column = "DS_CARGO")
    private String DS_CARGO;

    @Column(name = "SQ_CANDIDATO")
    @CsvBindByName(column = "SQ_CANDIDATO")
    private String SQ_CANDIDATO;

    @Column(name = "NR_CANDIDATO")
    @CsvBindByName(column = "NR_CANDIDATO")
    private String NR_CANDIDATO;

    @Column(name = "NM_CANDIDATO")
    @CsvBindByName(column = "NM_CANDIDATO")
    private String NM_CANDIDATO;

    @Column(name = "NM_URNA_CANDIDATO")
    @CsvBindByName(column = "NM_URNA_CANDIDATO")
    private String NM_URNA_CANDIDATO;

    @Column(name = "NM_SOCIAL_CANDIDATO")
    @CsvBindByName(column = "NM_SOCIAL_CANDIDATO")
    private String NM_SOCIAL_CANDIDATO;

    @Column(name = "NR_CPF_CANDIDATO")
    @CsvBindByName(column = "NR_CPF_CANDIDATO")
    private String NR_CPF_CANDIDATO;

    @Column(name = "NM_EMAIL")
    @CsvBindByName(column = "NM_EMAIL")
    private String NM_EMAIL;

    @Column(name = "CD_SITUACAO_CANDIDATURA")
    @CsvBindByName(column = "CD_SITUACAO_CANDIDATURA")
    private String CD_SITUACAO_CANDIDATURA;

    @Column(name = "DS_SITUACAO_CANDIDATURA")
    @CsvBindByName(column = "DS_SITUACAO_CANDIDATURA")
    private String DS_SITUACAO_CANDIDATURA;

    @Column(name = "CD_DETALHE_SITUACAO_CAND")
    @CsvBindByName(column = "CD_DETALHE_SITUACAO_CAND")
    private String CD_DETALHE_SITUACAO_CAND;

    @Column(name = "DS_DETALHE_SITUACAO_CAND")
    @CsvBindByName(column = "DS_DETALHE_SITUACAO_CAND")
    private String DS_DETALHE_SITUACAO_CAND;

    @Column(name = "TP_AGREMIACAO")
    @CsvBindByName(column = "TP_AGREMIACAO")
    private String TP_AGREMIACAO;

    @Column(name = "NR_PARTIDO")
    @CsvBindByName(column = "NR_PARTIDO")
    private String NR_PARTIDO;

    @Column(name = "SG_PARTIDO")
    @CsvBindByName(column = "SG_PARTIDO")
    private String SG_PARTIDO;

    @Column(name = "NM_PARTIDO")
    @CsvBindByName(column = "NM_PARTIDO")
    private String NM_PARTIDO;

    @Column(name = "SQ_COLIGACAO")
    @CsvBindByName(column = "SQ_COLIGACAO")
    private String SQ_COLIGACAO;

    @Column(name = "NM_COLIGACAO")
    @CsvBindByName(column = "NM_COLIGACAO")
    private String NM_COLIGACAO;

    @Column(name = "DS_COMPOSICAO_COLIGACAO")
    @CsvBindByName(column = "DS_COMPOSICAO_COLIGACAO")
    private String DS_COMPOSICAO_COLIGACAO;

    @Column(name = "CD_NACIONALIDADE")
    @CsvBindByName(column = "CD_NACIONALIDADE")
    private String CD_NACIONALIDADE;

    @Column(name = "DS_NACIONALIDADE")
    @CsvBindByName(column = "DS_NACIONALIDADE")
    private String DS_NACIONALIDADE;

    @Column(name = "SG_UF_NASCIMENTO")
    @CsvBindByName(column = "SG_UF_NASCIMENTO")
    private String SG_UF_NASCIMENTO;

    @Column(name = "CD_MUNICIPIO_NASCIMENTO")
    @CsvBindByName(column = "CD_MUNICIPIO_NASCIMENTO")
    private String CD_MUNICIPIO_NASCIMENTO;

    @Column(name = "NM_MUNICIPIO_NASCIMENTO")
    @CsvBindByName(column = "NM_MUNICIPIO_NASCIMENTO")
    private String NM_MUNICIPIO_NASCIMENTO;

    @Column(name = "DT_NASCIMENTO")
    @CsvBindByName(column = "DT_NASCIMENTO")
    private String DT_NASCIMENTO;

    @Column(name = "NR_IDADE_DATA_POSSE")
    @CsvBindByName(column = "NR_IDADE_DATA_POSSE")
    private String NR_IDADE_DATA_POSSE;

    @Column(name = "NR_TITULO_ELEITORAL_CANDIDATO")
    @CsvBindByName(column = "NR_TITULO_ELEITORAL_CANDIDATO")
    private String NR_TITULO_ELEITORAL_CANDIDATO;

    @Column(name = "CD_GENERO")
    @CsvBindByName(column = "CD_GENERO")
    private String CD_GENERO;

    @Column(name = "DS_GENERO")
    @CsvBindByName(column = "DS_GENERO")
    private String DS_GENERO;

    @Column(name = "CD_GRAU_INSTRUCAO")
    @CsvBindByName(column = "CD_GRAU_INSTRUCAO")
    private String CD_GRAU_INSTRUCAO;

    @Column(name = "DS_GRAU_INSTRUCAO")
    @CsvBindByName(column = "DS_GRAU_INSTRUCAO")
    private String DS_GRAU_INSTRUCAO;

    @Column(name = "CD_ESTADO_CIVIL")
    @CsvBindByName(column = "CD_ESTADO_CIVIL")
    private String CD_ESTADO_CIVIL;

    @Column(name = "DS_ESTADO_CIVIL")
    @CsvBindByName(column = "DS_ESTADO_CIVIL")
    private String DS_ESTADO_CIVIL;

    @Column(name = "CD_COR_RACA")
    @CsvBindByName(column = "CD_COR_RACA")
    private String CD_COR_RACA;

    @Column(name = "DS_COR_RACA")
    @CsvBindByName(column = "DS_COR_RACA")
    private String DS_COR_RACA;

    @Column(name = "CD_OCUPACAO")
    @CsvBindByName(column = "CD_OCUPACAO")
    private String CD_OCUPACAO;

    @Column(name = "DS_OCUPACAO")
    @CsvBindByName(column = "DS_OCUPACAO")
    private String DS_OCUPACAO;

    @Column(name = "VR_DESPESA_MAX_CAMPANHA")
    @CsvBindByName(column = "VR_DESPESA_MAX_CAMPANHA")
    private String VR_DESPESA_MAX_CAMPANHA;

    @Column(name = "CD_SIT_TOT_TURNO")
    @CsvBindByName(column = "CD_SIT_TOT_TURNO")
    private String CD_SIT_TOT_TURNO;

    @Column(name = "DS_SIT_TOT_TURNO")
    @CsvBindByName(column = "DS_SIT_TOT_TURNO")
    private String DS_SIT_TOT_TURNO;

    @Column(name = "ST_REELEICAO")
    @CsvBindByName(column = "ST_REELEICAO")
    private String ST_REELEICAO;

    @Column(name = "ST_DECLARAR_BENS")
    @CsvBindByName(column = "ST_DECLARAR_BENS")
    private String ST_DECLARAR_BENS;

    @Column(name = "NR_PROTOCOLO_CANDIDATURA")
    @CsvBindByName(column = "NR_PROTOCOLO_CANDIDATURA")
    private String NR_PROTOCOLO_CANDIDATURA;

    @Column(name = "NR_PROCESSO")
    @CsvBindByName(column = "NR_PROCESSO")
    private String NR_PROCESSO;

    @Column(name = "CD_SITUACAO_CANDIDATO_PLEITO")
    @CsvBindByName(column = "CD_SITUACAO_CANDIDATO_PLEITO")
    private String CD_SITUACAO_CANDIDATO_PLEITO;

    @Column(name = "DS_SITUACAO_CANDIDATO_PLEITO")
    @CsvBindByName(column = "DS_SITUACAO_CANDIDATO_PLEITO")
    private String DS_SITUACAO_CANDIDATO_PLEITO;

    @Column(name = "CD_SITUACAO_CANDIDATO_URNA")
    @CsvBindByName(column = "CD_SITUACAO_CANDIDATO_URNA")
    private String CD_SITUACAO_CANDIDATO_URNA;

    @Column(name = "DS_SITUACAO_CANDIDATO_URNA")
    @CsvBindByName(column = "DS_SITUACAO_CANDIDATO_URNA")
    private String DS_SITUACAO_CANDIDATO_URNA;

    @Column(name = "ST_CANDIDATO_INSERIDO_URNA")
    @CsvBindByName(column = "ST_CANDIDATO_INSERIDO_URNA")
    private String ST_CANDIDATO_INSERIDO_URNA;
    
//DT_GERACAO
//HH_GERACAO
//ANO_ELEICAO
//CD_TIPO_ELEICAO
//NM_TIPO_ELEICAO
//NR_TURNO
//CD_ELEICAO
//DS_ELEICAO
//DT_ELEICAO
//TP_ABRANGENCIA
//SG_UF
//SG_UE
//NM_UE
//CD_CARGO
//DS_CARGO
//SQ_CANDIDATO
//NR_CANDIDATO
//NM_CANDIDATO
//NM_URNA_CANDIDATO
//NM_SOCIAL_CANDIDATO
//NR_CPF_CANDIDATO
//NM_EMAIL
//CD_SITUACAO_CANDIDATURA
//DS_SITUACAO_CANDIDATURA
//CD_DETALHE_SITUACAO_CAND
//DS_DETALHE_SITUACAO_CAND
//TP_AGREMIACAO
//NR_PARTIDO
//SG_PARTIDO
//NM_PARTIDO
//SQ_COLIGACAO
//NM_COLIGACAO
//DS_COMPOSICAO_COLIGACAO
//CD_NACIONALIDADE
//DS_NACIONALIDADE
//SG_UF_NASCIMENTO
//CD_MUNICIPIO_NASCIMENTO
//NM_MUNICIPIO_NASCIMENTO
//DT_NASCIMENTO
//NR_IDADE_DATA_POSSE
//NR_TITULO_ELEITORAL_CANDIDATO
//CD_GENERO
//DS_GENERO
//CD_GRAU_INSTRUCAO
//DS_GRAU_INSTRUCAO
//CD_ESTADO_CIVIL
//DS_ESTADO_CIVIL
//CD_COR_RACA
//DS_COR_RACA
//CD_OCUPACAO
//DS_OCUPACAO
//VR_DESPESA_MAX_CAMPANHA
//CD_SIT_TOT_TURNO
//DS_SIT_TOT_TURNO
//ST_REELEICAO
//ST_DECLARAR_BENS
//NR_PROTOCOLO_CANDIDATURA
//NR_PROCESSO
//CD_SITUACAO_CANDIDATO_PLEITO
//DS_SITUACAO_CANDIDATO_PLEITO
//CD_SITUACAO_CANDIDATO_URNA
//DS_SITUACAO_CANDIDATO_URNA
//ST_CANDIDATO_INSERIDO_URNA
}
