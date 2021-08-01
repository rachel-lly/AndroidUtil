package com.example.androidutil.DesignModel.Builder;

public abstract class Builder {

    //链式调用
    public abstract Builder buildBoard(String board);
    public abstract Builder buildDisplay(String display);
    public abstract Builder setOS();

    public abstract Computer createComputer();
}

