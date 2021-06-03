package com.br.naia.csvreadertodb.exception;

public class DataInvalidaException extends ValidationException {
    public DataInvalidaException() {
        super("Formato de data inválida");
    }
}
