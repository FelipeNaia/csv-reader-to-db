package com.br.naia.cadastropessoa.exception;

public class PessoaNaoEncontradaException extends NotFoundException {
    public PessoaNaoEncontradaException() {
        super("Pessoa não encontrada");
    }
}
