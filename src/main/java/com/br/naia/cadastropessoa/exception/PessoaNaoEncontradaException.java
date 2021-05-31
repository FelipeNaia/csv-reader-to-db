package com.br.naia.cadastropessoa.exception;

public class PessoaNaoEncontradaException extends ValidationException {
    public PessoaNaoEncontradaException() {
        super("Pessoa não encontrada");
    }
}
