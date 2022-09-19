package com.command;

public enum CommandConst {

    R(new SpinRightCommand()),

    L(new SpinLeftCommand()),

    M(new MoveForwardCommand());

    private final Command command;

    CommandConst(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }
}