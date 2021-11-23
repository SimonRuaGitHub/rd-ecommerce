package com.rapid.commerce.dto;

public class RestExceptionResult {

    private String message;

    public RestExceptionResult(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
