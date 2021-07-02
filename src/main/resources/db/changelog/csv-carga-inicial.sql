CREATE SCHEMA eleicao;

SET search_path = eleicao;

create table BEM (
    BEM_ID bigint PRIMARY KEY,
    DT_GERACAO character varying(255),
    HH_GERACAO character varying(255),
    ANO_ELEICAO character varying(255),
    CD_TIPO_ELEICAO character varying(255),
    NM_TIPO_ELEICAO character varying(255),
    CD_ELEICAO character varying(255),
    DS_ELEICAO character varying(255),
    DT_ELEICAO character varying(255),
    SG_UF character varying(255),
    SG_UE character varying(255),
    NM_UE character varying(255),
    SQ_CANDIDATO character varying(255),
    NR_ORDEM_CANDIDATO character varying(255),
    CD_TIPO_BEM_CANDIDATO character varying(255),
    DS_TIPO_BEM_CANDIDATO character varying(255),
    DS_BEM_CANDIDATO character varying(255),
    VR_BEM_CANDIDATO character varying(255),
    DT_ULTIMA_ATUALIZACAO character varying(255),
    HH_ULTIMA_ATUALIZACAO character varying(255)
);

create table CANDIDATO (
    CANDIDATO_ID bigint PRIMARY KEY,
    DT_GERACAO character varying(255),
    HH_GERACAO character varying(255),
    ANO_ELEICAO character varying(255),
    CD_TIPO_ELEICAO character varying(255),
    NM_TIPO_ELEICAO character varying(255),
    NR_TURNO character varying(255),
    CD_ELEICAO character varying(255),
    DS_ELEICAO character varying(255),
    DT_ELEICAO character varying(255),
    TP_ABRANGENCIA character varying(255),
    SG_UF character varying(255),
    SG_UE character varying(255),
    NM_UE character varying(255),
    CD_CARGO character varying(255),
    DS_CARGO character varying(255),
    SQ_CANDIDATO character varying(255),
    NR_CANDIDATO character varying(255),
    NM_CANDIDATO character varying(255),
    NM_URNA_CANDIDATO character varying(255),
    NM_SOCIAL_CANDIDATO character varying(255),
    NR_CPF_CANDIDATO character varying(255),
    NM_EMAIL character varying(255),
    CD_SITUACAO_CANDIDATURA character varying(255),
    DS_SITUACAO_CANDIDATURA character varying(255),
    CD_DETALHE_SITUACAO_CAND character varying(255),
    DS_DETALHE_SITUACAO_CAND character varying(255),
    TP_AGREMIACAO character varying(255),
    NR_PARTIDO character varying(255),
    SG_PARTIDO character varying(255),
    NM_PARTIDO character varying(255),
    SQ_COLIGACAO character varying(255),
    NM_COLIGACAO character varying(255),
    DS_COMPOSICAO_COLIGACAO character varying(255),
    CD_NACIONALIDADE character varying(255),
    DS_NACIONALIDADE character varying(255),
    SG_UF_NASCIMENTO character varying(255),
    CD_MUNICIPIO_NASCIMENTO character varying(255),
    NM_MUNICIPIO_NASCIMENTO character varying(255),
    DT_NASCIMENTO character varying(255),
    NR_IDADE_DATA_POSSE character varying(255),
    NR_TITULO_ELEITORAL_CANDIDATO character varying(255),
    CD_GENERO character varying(255),
    DS_GENERO character varying(255),
    CD_GRAU_INSTRUCAO character varying(255),
    DS_GRAU_INSTRUCAO character varying(255),
    CD_ESTADO_CIVIL character varying(255),
    DS_ESTADO_CIVIL character varying(255),
    CD_COR_RACA character varying(255),
    DS_COR_RACA character varying(255),
    CD_OCUPACAO character varying(255),
    DS_OCUPACAO character varying(255),
    VR_DESPESA_MAX_CAMPANHA character varying(255),
    CD_SIT_TOT_TURNO character varying(255),
    DS_SIT_TOT_TURNO character varying(255),
    ST_REELEICAO character varying(255),
    ST_DECLARAR_BENS character varying(255),
    NR_PROTOCOLO_CANDIDATURA character varying(255),
    NR_PROCESSO character varying(255),
    CD_SITUACAO_CANDIDATO_PLEITO character varying(255),
    DS_SITUACAO_CANDIDATO_PLEITO character varying(255),
    CD_SITUACAO_CANDIDATO_URNA character varying(255),
    DS_SITUACAO_CANDIDATO_URNA character varying(255),
    ST_CANDIDATO_INSERIDO_URNA character varying(255)
);

create table CASSACAO (
    CASSACAO_ID bigint PRIMARY KEY,
    DT_GERACAO character varying(255),
    HH_GERACAO character varying(255),
    ANO_ELEICAO character varying(255),
    CD_TIPO_ELEICAO character varying(255),
    NM_TIPO_ELEICAO character varying(255),
    CD_ELEICAO character varying(255),
    DS_ELEICAO character varying(255),
    SG_UF character varying(255),
    SG_UE character varying(255),
    NM_UE character varying(255),
    SQ_CANDIDATO character varying(255),
    DS_MOTIVO_CASSACAO character varying(255)

);

create table COLIGACAO (
    COLIGACAO_ID bigint PRIMARY KEY,
    DT_GERACAO character varying(255),
    HH_GERACAO character varying(255),
    ANO_ELEICAO character varying(255),
    CD_TIPO_ELEICAO character varying(255),
    NM_TIPO_ELEICAO character varying(255),
    NR_TURNO character varying(255),
    CD_ELEICAO character varying(255),
    DS_ELEICAO character varying(255),
    DT_ELEICAO character varying(255),
    SG_UF character varying(255),
    SG_UE character varying(255),
    NM_UE character varying(255),
    CD_CARGO character varying(255),
    DS_CARGO character varying(255),
    TP_AGREMIACAO character varying(255),
    NR_PARTIDO character varying(255),
    SG_PARTIDO character varying(255),
    NM_PARTIDO character varying(255),
    SQ_COLIGACAO character varying(255),
    NM_COLIGACAO character varying(255),
    DS_COMPOSICAO_COLIGACAO character varying(255),
    CD_SITUACAO_LEGENDA character varying(255),
    DS_SITUACAO character varying(255)

);

create table VAGA (
    VAGA_ID bigint PRIMARY KEY,
    DT_GERACAO character varying(255),
    HH_GERACAO character varying(255),
    ANO_ELEICAO character varying(255),
    CD_TIPO_ELEICAO character varying(255),
    NM_TIPO_ELEICAO character varying(255),
    CD_ELEICAO character varying(255),
    DS_ELEICAO character varying(255),
    DT_ELEICAO character varying(255),
    DT_POSSE character varying(255),
    SG_UF character varying(255),
    SG_UE character varying(255),
    NM_UE character varying(255),
    CD_CARGO character varying(255),
    DS_CARGO character varying(255),
    QT_VAGAS character varying(255)

);

CREATE SEQUENCE eleicao.seq_bem
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE SEQUENCE eleicao.seq_candidato
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE SEQUENCE eleicao.seq_cassacao
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE SEQUENCE eleicao.seq_coligacao
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE SEQUENCE eleicao.seq_vaga
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;