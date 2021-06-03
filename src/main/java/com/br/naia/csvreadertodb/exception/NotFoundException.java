package com.br.naia.csvreadertodb.exception;

abstract class NotFoundException extends RuntimeException {
    NotFoundException(String message) {
        super(message);
    }
}
