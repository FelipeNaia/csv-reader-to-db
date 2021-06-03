package com.br.naia.csvreadertodb.exception;

abstract class ValidationException extends NotFoundException {
    ValidationException(String message) {
        super(message);
    }
}
