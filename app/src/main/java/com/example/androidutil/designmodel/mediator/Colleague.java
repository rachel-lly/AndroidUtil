package com.example.androidutil.designmodel.mediator;

abstract class Colleague {
    Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
