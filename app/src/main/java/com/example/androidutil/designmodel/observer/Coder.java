package com.example.androidutil.designmodel.observer;

import java.util.Observable;
import java.util.Observer;

class Coder implements Observer {

    String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("name :"+name+"\ncontent update:"+arg);
    }
}
