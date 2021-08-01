package com.example.androidutil.DesignModel.Builder;

class MaxbookBuilder extends Builder {

    private Computer mComputer = new Macbook();

    @Override
    public void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    public void setOS() {
        mComputer.setOS();
    }

    @Override
    public Computer createComputer() {
        return mComputer;
    }
}
