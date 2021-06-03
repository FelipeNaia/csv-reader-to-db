package com.br.naia.csvreadertodb.exception;

public class CpfInvalidoException extends ValidationException {
    public CpfInvalidoException() {
        super("CPF inválido");
    }
}
