-- Quais os 5 partidos que mais tiveram candidatos cassados?

select nm_partido, count(*)
from eleicao.cassacao
    join eleicao.candidato ca on cassacao.sq_candidato = ca.sq_candidato
group by nm_partido order by count(*) desc limit 5;

-- Liste nome e CPF destes candidatos.

select distinct ca.nm_candidato, ca.nr_cpf_candidato from eleicao.cassacao join eleicao.candidato ca on cassacao.sq_candidato = ca.sq_candidato;

-- Quantos homens e quantas mulheres são candidatos?
select DS_GENERO, count(*) from candidato group by DS_GENERO;


-- Faça uma ordenação decrescente da quantidade de candidatos por cor/raça
-- declaradas.
select DS_COR_RACA, count(*) from candidato group by DS_COR_RACA order by count(*) desc;

-- Quais os 5 candidatos que possuem a maior quantidade de Bens declarados
-- em valores financeiros? Liste nome completo, CPF e valor total em bens
select c.nm_candidato, c.nr_cpf_candidato, sum(cast(replace(vr_bem_candidato, ',', '.') as DOUBLE PRECISION)) as patrimonio
from bem join candidato c on bem.sq_candidato = c.sq_candidato group by c.nm_candidato, c.nr_cpf_candidato order by patrimonio desc limit 5;

-- Liste os 10 candidatos mais idosos (nome, CPF e idade). Em caso de
-- empate, lista os ordenados pelo nome do candidato.
select nm_candidato, nr_cpf_candidato, dt_nascimento, EXTRACT(year FROM age(current_date,dt_nascimento::date))::int as idade
from candidato order by idade desc, nm_candidato;

-- Quais os bens mais valiosos declarados (Ordenar decrescentemente os 10
-- maiores).
select cast(replace(vr_bem_candidato, ',', '.') as DOUBLE PRECISION) as valor, ds_tipo_bem_candidato, c.nm_candidato from bem
join candidato c on bem.sq_candidato = c.sq_candidato order by valor desc