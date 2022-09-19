package com.orientation;

import com.rover.Rover;

public class East implements Orientation {

    @Override
    public String getAcronym() {
        return "E";
    }

    @Override
    public Orientation spinRight() {
        return new South();
    }

    @Override
    public Orientation spinLeft() {
        return new North();
    }

    @Override
    public void moveForward(Rover rover) {
        rover.setCoordinateX(rover.getCoordinateX() + 1);
    }

    @Override
    public void moveBack(Rover rover) {
        rover.setCoordinateX(rover.getCoordinateX() - 1);
    }
}