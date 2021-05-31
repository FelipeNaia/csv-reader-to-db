package com.br.naia.cadastropessoa.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse<T> {
    private String message;
    private String code;
    private T data;

    public ErrorResponse(Exception exception, String code) {
        this.message = exception.getMessage();
        this.code = code;
    }
}
