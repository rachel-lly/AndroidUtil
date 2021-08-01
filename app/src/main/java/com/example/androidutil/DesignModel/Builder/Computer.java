package com.example.androidutil.DesignModel.Builder;

public abstract class Computer {

    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    public Computer() {
    }

    public void setBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    public void setDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public abstract void setOS();
}



