package com.plateau;

public class Plateau {

    private int minX;
    private int minY;
    private int maxX;
    private int maxY;

    public Plateau(int maxX, int maxY) {
        this.minX = 0;
        this.minY = 0;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public int getMinX() {
        return minX;
    }

    public int getMinY() {
        return minY;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }
}
