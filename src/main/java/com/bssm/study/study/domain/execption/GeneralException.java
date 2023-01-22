package com.bssm.study.study.domain.execption;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class GeneralException extends RuntimeException {

    private final HttpStatus httpStatus;
    private final String message;

    public GeneralException(HttpStatus httpStatus, String message) {
        super(message);
        this.httpStatus = httpStatus;
        this.message = message;
    }
}