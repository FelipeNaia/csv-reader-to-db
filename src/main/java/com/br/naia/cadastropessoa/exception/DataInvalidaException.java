package com.br.naia.cadastropessoa.exception;

public class DataInvalidaException extends ValidationException {
    public DataInvalidaException() {
        super("Formato de data inválida");
    }
}
