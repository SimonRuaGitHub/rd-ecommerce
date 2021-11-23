package com.rapid.commerce.exception;

public class ConsumerNotFoundException extends RuntimeException{

    public ConsumerNotFoundException(String message) {
        super(message);
    }

    public ConsumerNotFoundException(Throwable cause) {
            super(cause.getMessage(),cause);
    }
}
