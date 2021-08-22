package com.example.androidutil.designmodel.mediator;

abstract class Mediator {
    ConcreteColleagueA colleagueA;
    ConcreteColleagueB colleagueB;

    public abstract void method();

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }
}
