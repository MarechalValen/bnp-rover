package com.rover;

import com.command.Command;
import com.orientation.Orientation;
import com.plateau.Plateau;

import java.util.List;

public class Rover {

    private int coordinateX;
    private int coordinateY;
    private Orientation orientation;
    private final Plateau plateau;

    public Rover(int coordinateX, int coordinateY, Orientation orientation, Plateau plateau) {
        this.plateau = plateau;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.orientation = orientation;
    }

    /**
     * Execute command one by one
     * @param commands list of {@link Command}
     */
    public void executeCommandList(List<Command> commands) {
        for (Command command : commands) {
            command.executeCommand(this);
            if (!this.isChecked()) {
                System.out.println("Rover is going out of the plateau");
                break;
            }
        }
    }

    public void spinRight() {
        orientation = getOrientation().spinRight();
    }

    public void spinLeft() {
        orientation = getOrientation().spinLeft();
    }

    public void moveForward() {
        getOrientation().moveForward(this);
    }

    public boolean isChecked() {
        return !(getCoordinateX() > getPlateau().getMaxX()
                || getCoordinateY() > getPlateau().getMaxY()
                || getCoordinateX() < getPlateau().getMinX()
                || getCoordinateY() < getPlateau().getMinY());
    }

    private Plateau getPlateau() {
        return plateau;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }
}
