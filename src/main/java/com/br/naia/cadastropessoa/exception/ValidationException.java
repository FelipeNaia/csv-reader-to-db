package com.br.naia.cadastropessoa.exception;

abstract class ValidationException extends NotFoundException {
    ValidationException(String message) {
        super(message);
    }
}
