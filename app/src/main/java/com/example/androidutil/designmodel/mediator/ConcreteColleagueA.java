package com.example.androidutil.designmodel.mediator;

class ConcreteColleagueA extends Colleague{
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("put the message to mediator");
    }
}
