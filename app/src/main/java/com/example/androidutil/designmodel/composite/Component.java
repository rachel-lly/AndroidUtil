package com.example.androidutil.designmodel.composite;

abstract class Component {
    String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void doSomething();

    public abstract void addChild(Component child);

    public abstract void removeChild(Component child);

    public abstract Component getChild(int index);
}
