package com.rover;

import com.orientation.OrientationConst;
import com.plateau.Plateau;

public class RoverUtils {

    /**
     * Build Rover in the plateau with coordinates from file
     *
     * @param coordinatesFromFile Rover coordinates and orientation from file
     * @param plateau Plateau already built
     *
     * @return {@link Rover}
     */
    public static Rover buildRoverPosition(String coordinatesFromFile, Plateau plateau) {
        if (plateau == null) {
            throw new RoverException("ROVER : Rover building failed, plateau cannot be null");
        }
        String[] coordinates = coordinatesFromFile.split(" ");
        if (coordinates.length == 3) {
            return new Rover(Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1]), OrientationConst.valueOf(coordinates[2]).getOrientation(), plateau);
        }
        throw new RoverException("ROVER : Rover building failed, coordinates must contain two integers and one letter between N,S,E,W");
    }
}
