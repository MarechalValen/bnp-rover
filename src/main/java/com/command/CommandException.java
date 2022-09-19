package com.command;

public class CommandException extends RuntimeException {

    public CommandException() {
        super("COMMAND : technical error");
    }

    public CommandException(String message) {
        super(message);
    }
}
