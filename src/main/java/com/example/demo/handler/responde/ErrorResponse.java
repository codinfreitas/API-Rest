package com.example.demo.handler.responde;

public class ErrorResponse {

    private final String code;

    private final String message;

    public ErrorResponse(String message, String code) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
