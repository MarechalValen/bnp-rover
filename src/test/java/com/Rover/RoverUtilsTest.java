package com.Rover;

import com.orientation.OrientationConst;
import com.plateau.Plateau;
import com.rover.Rover;
import com.rover.RoverException;
import com.rover.RoverUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class RoverUtilsTest {

    @Test
    public void buildRoverPosition() {
        Rover rover = RoverUtils.buildRoverPosition("1 3 E", new Plateau(5,5));

        Assert.assertNotNull(rover);
        Assert.assertEquals(1, rover.getCoordinateX());
        Assert.assertEquals(3, rover.getCoordinateY());
        Assert.assertEquals(OrientationConst.E.getAcronym(), rover.getOrientation().getAcronym());
    }

    @Test(expected = RoverException.class)
    public void buildRoverPositionWithoutOrientation() {
        RoverUtils.buildRoverPosition("1 3", new Plateau(5,5));
    }
}
