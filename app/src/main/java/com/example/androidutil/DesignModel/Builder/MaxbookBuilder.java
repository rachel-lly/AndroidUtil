package com.example.androidutil.DesignModel.Builder;

class MaxbookBuilder extends Builder {

    private Computer mComputer = new Macbook();

    @Override
    public Builder buildBoard(String board) {
        mComputer.setBoard(board);
        return this;
    }

    @Override
    public Builder buildDisplay(String display) {
        mComputer.setDisplay(display);
        return this;
    }

    @Override
    public Builder setOS() {
        mComputer.setOS();
        return this;
    }

    @Override
    public Computer createComputer() {
        return mComputer;
    }

    public static void main(String[] args) {
        Builder builder = new MaxbookBuilder();
        Computer computer = builder.buildBoard("英特尔主板").buildDisplay("Retina显示器").setOS().createComputer();
        System.out.println(computer.toString());
    }
}


