package com.br.naia.csvreadertodb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContatoDto {
    private Long id;
    private String nome;
    private String telefone;
    private String email;
}
