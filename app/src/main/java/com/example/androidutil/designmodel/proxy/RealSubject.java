package com.example.androidutil.designmodel.proxy;

class RealSubject extends Subject{
    @Override
    public void visit() {
        System.out.println("real subject");
    }
}
