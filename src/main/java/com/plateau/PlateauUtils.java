package com.plateau;

public class PlateauUtils {

    /**
     * Build plateau from upper coordinates from file
     *
     * @param upperCoordinatesFromFile upper coordinates (X,Y)
     * @return {@link Plateau}
     */
        public static Plateau buildPlateauFromFile(String upperCoordinatesFromFile) {
            try {
                String[] dimensions = upperCoordinatesFromFile.split(" ");
                if (dimensions.length == 2) {
                    return new Plateau(Integer.parseInt(dimensions[0]), Integer.parseInt(dimensions[1]));
                }
            } catch (NumberFormatException e) {
                throw new PlateauException("PLATEAU : coordinates must be integers");
            }
            throw new PlateauException("PLATEAU : Please give two coordinates");
        }

}
