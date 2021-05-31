CREATE SCHEMA cadastro_pessoa;

SET search_path = cadastro_pessoa;

create table pessoa (
    pe_id bigint PRIMARY KEY,
    pe_nome character varying(255) not null,
    pe_cpf character varying(11) not null,
    pe_data_nascimento timestamp(6) not null
);

create table contato (
    co_id bigint PRIMARY KEY,
    co_nome character varying(255) not null,
    co_telefone character varying(255) not null,
    co_email character varying(255) not null
);