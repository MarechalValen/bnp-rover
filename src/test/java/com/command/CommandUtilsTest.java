package com.command;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.List;

@RunWith(BlockJUnit4ClassRunner.class)
public class CommandUtilsTest {

    @Test
    public void buildCommandListTest() {
        List<Command> result = CommandUtils.getCommandsFromFile("LRM");

        Assert.assertEquals(3, result.size());
        Assert.assertEquals(SpinLeftCommand.class, result.get(0).getClass());
        Assert.assertEquals(SpinRightCommand.class, result.get(1).getClass());
        Assert.assertEquals(MoveForwardCommand.class, result.get(2).getClass());

    }

    @Test(expected = CommandException.class)
    public void buildCommandListWithUnknownCommandTest() {
        CommandUtils.getCommandsFromFile("LRMA");
    }
}
