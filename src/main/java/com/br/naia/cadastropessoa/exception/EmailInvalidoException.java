package com.br.naia.cadastropessoa.exception;

public class EmailInvalidoException extends ValidationException {
    public EmailInvalidoException() {
        super("Formato de e-mail inválido");
    }
}
