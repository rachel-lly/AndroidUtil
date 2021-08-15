package com.example.androidutil.designmodel.Observer;

class Test {
    public static void main(String[] args) {
        DevTechFrontier frontier = new DevTechFrontier();

        Coder coder = new Coder("1");

        frontier.addObserver(coder);
        frontier.postNewPublication("hhhhhhh");
    }
}
