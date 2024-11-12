package com.msp.library.mgmt.exception;

public class InvalidBookRequestException extends RuntimeException{

    public InvalidBookRequestException(String message) {
        super(message);
    }
}
