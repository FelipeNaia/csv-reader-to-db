package com.br.naia.cadastropessoa.exception;

public class CpfInvalidoException extends ValidationException {
    public CpfInvalidoException() {
        super("CPF inválido");
    }
}
