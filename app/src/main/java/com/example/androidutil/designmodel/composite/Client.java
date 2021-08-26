package com.example.androidutil.designmodel.composite;

class Client {
    public static void main(String[] args) {
        Component root = new Composite("Root");

        Component leftBranch = new Composite("leftBranch");
        Component rightBranch = new Composite("rightBranch");

        Component leaf1 = new Leaf("leaf1");
        Component leaf2 = new Leaf("leaf2");

        leftBranch.addChild(leaf1);
        rightBranch.addChild(leaf2);

        root.addChild(leftBranch);
        root.addChild(rightBranch);

        root.doSomething();
    }
}
