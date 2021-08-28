package com.example.androidutil.designmodel.bridge;

abstract class Abstraction {
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation(){
        implementor.operationImpl();
    }
}
