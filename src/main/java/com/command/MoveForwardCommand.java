package com.command;

import com.rover.Rover;

public class MoveForwardCommand implements Command {

    @Override
    public void executeCommand(Rover rover) {
        rover.moveForward();
    }
}