alter table cadastro_pessoa.contato add column pe_id bigint not null ;

alter table cadastro_pessoa.contato
add constraint fk_contato_pessoa
foreign key (pe_id)
references cadastro_pessoa.pessoa(pe_id)