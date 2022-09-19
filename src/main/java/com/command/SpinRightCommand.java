package com.command;

import com.rover.Rover;

public class SpinRightCommand implements Command {

    @Override
    public void executeCommand(Rover rover) {
        rover.spinRight();
    }
}