package com.jocelyncooper.backend.exception;

public class InvalidTicketInfoException extends RuntimeException {
    public InvalidTicketInfoException(String message) {
        super(message);
    }
}
