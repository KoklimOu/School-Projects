package com.crud.generic.Dto;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ResponseDto {
    private String message;
    private int statusCode = HttpStatus.OK.value();
    private Object data = null;

    public ResponseDto(String message) {
        this.message = message;
    }

    public ResponseDto(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    public ResponseDto(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }
}