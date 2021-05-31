package com.br.naia.cadastropessoa.exception;

abstract class NotFoundException extends RuntimeException {
    NotFoundException(String message) {
        super(message);
    }
}
