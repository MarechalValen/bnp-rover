package com.orientation;

import com.rover.Rover;

public class North implements Orientation {

    @Override
    public String getAcronym() {
        return "N";
    }

    @Override
    public Orientation spinRight() {
        return new East();
    }

    @Override
    public Orientation spinLeft() {
        return new West();
    }

    @Override
    public void moveForward(Rover rover) {
        rover.setCoordinateY(rover.getCoordinateY() + 1);
    }

    @Override
    public void moveBack(Rover rover) {
        rover.setCoordinateY(rover.getCoordinateY() - 1);
    }
}