package com.br.naia.csvreadertodb.exception;

public class PessoaNaoEncontradaException extends NotFoundException {
    public PessoaNaoEncontradaException() {
        super("Pessoa não encontrada");
    }
}
