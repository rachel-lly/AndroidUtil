package com.example.androidutil.DesignModel.Builder;

public abstract class Builder {

    public abstract void buildBoard(String board);
    public abstract void buildDisplay(String display);
    public abstract void setOS();

    public abstract Computer createComputer();
}

