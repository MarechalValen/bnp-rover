package com.Rover;


import com.command.Command;
import com.command.CommandConst;
import com.plateau.Plateau;
import com.rover.Rover;
import com.rover.RoverUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(BlockJUnit4ClassRunner.class)
public class RoverTest {

    @Test
    public void executeCommandListTest() {
        Rover rover = RoverUtils.buildRoverPosition("1 3 E", new Plateau(5,5));

        Command c1 = CommandConst.L.getCommand();
        Command c2 = CommandConst.R.getCommand();
        Command c3 = CommandConst.M.getCommand();

        List<Command> commands = new ArrayList<>();
        commands.add(c1);
        commands.add(c2);
        commands.add(c3);

        rover.executeCommandList(commands);

        Assert.assertEquals(2, rover.getCoordinateX());
        Assert.assertEquals(3, rover.getCoordinateY());
        Assert.assertEquals("E", rover.getOrientation().getAcronym());
    }

    @Test
    public void executeCommandListWithRoverStuckTest() {
        Rover rover = RoverUtils.buildRoverPosition("4 3 E", new Plateau(5,5));

        Command c1 = CommandConst.L.getCommand();
        Command c2 = CommandConst.R.getCommand();
        Command c3 = CommandConst.M.getCommand();
        Command c4 = CommandConst.M.getCommand();
        Command c5 = CommandConst.M.getCommand();
        Command c6 = CommandConst.M.getCommand();

        List<Command> commands = new ArrayList<>();
        commands.add(c1);
        commands.add(c2);
        commands.add(c3);
        commands.add(c4);
        commands.add(c5);
        commands.add(c6);

        rover.executeCommandList(commands);

        Assert.assertEquals(6, rover.getCoordinateX());
        Assert.assertEquals(3, rover.getCoordinateY());
        Assert.assertEquals("E", rover.getOrientation().getAcronym());
    }
}
