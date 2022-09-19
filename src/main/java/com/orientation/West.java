package com.orientation;

import com.rover.Rover;

public class West implements Orientation {

    @Override
    public String getAcronym() {
        return "W";
    }

    @Override
    public Orientation spinRight() {
        return new North();
    }

    @Override
    public Orientation spinLeft() {
        return new South();
    }

    @Override
    public void moveForward(Rover rover) {
        rover.setCoordinateX(rover.getCoordinateX() - 1);
    }

    @Override
    public void moveBack(Rover rover) {
        rover.setCoordinateX(rover.getCoordinateX() + 1);
    }
}
