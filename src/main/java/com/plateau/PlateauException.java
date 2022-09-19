package com.plateau;

public class PlateauException extends RuntimeException {

    public PlateauException() {
        super("ROVER : technical error");
    }

    public PlateauException(String message) {
        super(message);
    }
}
