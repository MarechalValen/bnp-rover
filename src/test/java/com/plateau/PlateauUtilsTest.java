package com.plateau;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class PlateauUtilsTest {

    @Test
    public void buildPlateauWithGoodCoordinates() {
        Plateau plateau = PlateauUtils.buildPlateauFromFile("1 3");
        Assert.assertEquals(1, plateau.getMaxX());
        Assert.assertEquals(3, plateau.getMaxY());
        Assert.assertEquals(0, plateau.getMinX());
        Assert.assertEquals(0, plateau.getMinY());
    }

    @Test(expected = PlateauException.class)
    public void buildPlateauWithAlphanumericCoordinates() {
        PlateauUtils.buildPlateauFromFile("1 E");
    }

    @Test(expected = PlateauException.class)
    public void buildPlateauWithOnlyOneCoordinate() {
        PlateauUtils.buildPlateauFromFile("1");
    }

    @Test(expected = PlateauException.class)
    public void buildPlateauWithMoreThanTwoCoordinates() {
        PlateauUtils.buildPlateauFromFile("1 5 6 7");
    }
}
