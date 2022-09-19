package com.orientation;

import com.rover.Rover;

public class South implements Orientation {

    @Override
    public String getAcronym() {
        return "S";
    }

    @Override
    public Orientation spinRight() {
        return new West();
    }

    @Override
    public Orientation spinLeft() {
        return new East();
    }

    @Override
    public void moveForward(Rover rover) {
        rover.setCoordinateY(rover.getCoordinateY() - 1);
    }

    @Override
    public void moveBack(Rover rover) {
        rover.setCoordinateY(rover.getCoordinateY() + 1);
    }
}