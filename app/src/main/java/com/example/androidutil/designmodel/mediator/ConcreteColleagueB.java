package com.example.androidutil.designmodel.mediator;

class ConcreteColleagueB extends Colleague{
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("put the message to mediator");
    }
}