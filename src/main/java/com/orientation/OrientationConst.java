package com.orientation;

public enum OrientationConst {

    N("N", new North()),
    S("S", new South()),
    E("E", new East()),
    W("W", new West());

    private String acronym;
    private Orientation orientation;

    OrientationConst(String acronym, Orientation orientation) {
        this.acronym = acronym;
        this.orientation = orientation;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }
}