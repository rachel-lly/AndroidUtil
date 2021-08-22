package com.example.androidutil.designmodel.mediator;

class ConcreteMediator extends Mediator{

    @Override
    public void method() {
        colleagueA.action();
        colleagueB.action();
    }
}
