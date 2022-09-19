package com.orientation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class OrientationConstTest {

    @Test
    public void eastTest() {
        OrientationConst o = OrientationConst.E;
        Assert.assertEquals("E", o.getAcronym());
        Assert.assertEquals(North.class, o.getOrientation().spinLeft().getClass());
        Assert.assertEquals(South.class, o.getOrientation().spinRight().getClass());
    }

    @Test
    public void westTest() {
        OrientationConst o = OrientationConst.W;
        Assert.assertEquals("W", o.getAcronym());
        Assert.assertEquals(South.class, o.getOrientation().spinLeft().getClass());
        Assert.assertEquals(North.class, o.getOrientation().spinRight().getClass());
    }

    @Test
    public void northTest() {
        OrientationConst o = OrientationConst.N;
        Assert.assertEquals("N", o.getAcronym());
        Assert.assertEquals(West.class, o.getOrientation().spinLeft().getClass());
        Assert.assertEquals(East.class, o.getOrientation().spinRight().getClass());
    }

    @Test
    public void southTest() {
        OrientationConst o = OrientationConst.S;
        Assert.assertEquals("S", o.getAcronym());
        Assert.assertEquals(East.class, o.getOrientation().spinLeft().getClass());
        Assert.assertEquals(West.class, o.getOrientation().spinRight().getClass());
    }
}
