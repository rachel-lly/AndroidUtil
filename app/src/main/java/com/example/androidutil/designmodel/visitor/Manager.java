package com.example.androidutil.designmodel.visitor;

import java.util.Random;

class Manager extends Staff{
    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getProduce(){
        return new Random().nextInt(10);
    }
}
