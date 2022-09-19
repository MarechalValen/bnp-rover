package com.orientation;

import com.rover.Rover;

public interface Orientation {

    String getAcronym();

    Orientation spinRight();

    Orientation spinLeft();

    void moveForward(Rover rover);

    void moveBack(Rover rover);
}
