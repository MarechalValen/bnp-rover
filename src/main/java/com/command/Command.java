package com.command;

import com.rover.Rover;

public interface Command {

    void executeCommand(Rover rover);
}