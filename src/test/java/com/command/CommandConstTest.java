package com.command;

import com.orientation.Orientation;
import com.orientation.OrientationConst;
import com.plateau.Plateau;
import com.rover.Rover;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.List;

@RunWith(BlockJUnit4ClassRunner.class)
public class CommandConstTest {

    @Test
    public void spinRightCommandTest() {
        Orientation orientation = OrientationConst.E.getOrientation();
        Plateau plateau = new Plateau(5,5);
        Command command = CommandConst.R.getCommand();
        Rover rover = new Rover(1,3, orientation, plateau);
        command.executeCommand(rover);

        Assert.assertEquals(SpinRightCommand.class, command.getClass());
        Assert.assertEquals("S", rover.getOrientation().getAcronym());
    }


    @Test
    public void spinLeftCommandTest() {
        Orientation orientation = OrientationConst.E.getOrientation();
        Plateau plateau = new Plateau(5,5);
        Command command = CommandConst.L.getCommand();
        Rover rover = new Rover(1,3, orientation, plateau);
        command.executeCommand(rover);

        Assert.assertEquals(SpinLeftCommand.class, command.getClass());
        Assert.assertEquals("N", rover.getOrientation().getAcronym());
    }

    @Test
    public void moveForwardCommandTest() {
        Orientation orientation = OrientationConst.E.getOrientation();
        Plateau plateau = new Plateau(5,5);
        Command command = CommandConst.M.getCommand();
        Rover rover = new Rover(1,3, orientation, plateau);
        command.executeCommand(rover);

        Assert.assertEquals(MoveForwardCommand.class, command.getClass());
        Assert.assertEquals("E", rover.getOrientation().getAcronym());
        Assert.assertEquals(2, rover.getCoordinateX());
        Assert.assertEquals(3, rover.getCoordinateY());
    }
}
