package com.br.naia.csvreadertodb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDto {
    private Long id;
    private String nome;
    private String cpf;
    private String nascimento;
    private List<ContatoDto> contatos;
}
