package com.br.naia.csvreadertodb.exception;

public class EmailInvalidoException extends ValidationException {
    public EmailInvalidoException() {
        super("Formato de e-mail inválido");
    }
}
