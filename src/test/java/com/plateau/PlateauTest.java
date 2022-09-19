package com.plateau;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class PlateauTest {

    private Plateau plateau;

    @Before
    public void setpUp() {
        this.plateau = new Plateau(5,10);
    }

    @Test
    public void buildPlateauTest() {
        Assert.assertNotNull(plateau);
        Assert.assertEquals(5, plateau.getMaxX());
        Assert.assertEquals(10, plateau.getMaxY());
        Assert.assertEquals(0, plateau.getMinX());
        Assert.assertEquals(0, plateau.getMinY());
    }
}
