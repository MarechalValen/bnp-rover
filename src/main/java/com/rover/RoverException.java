package com.rover;

public class RoverException extends RuntimeException {

    public RoverException() {
        super("ROVER : technical error");
    }

    public RoverException(String message) {
        super(message);
    }
}