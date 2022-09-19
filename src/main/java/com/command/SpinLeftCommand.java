package com.command;

import com.rover.Rover;

public class SpinLeftCommand implements Command {

    @Override
    public void executeCommand(Rover rover) {
        rover.spinLeft();
    }
}