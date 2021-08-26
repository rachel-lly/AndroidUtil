package com.example.androidutil.designmodel.decorator;

class ConcreteDecoratorA extends Decorator{
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        super.operate();
        operatorA();
        operatorB();//装饰方法即可在父类方法前调用也可在后调用
    }

    public void operatorA(){

    }

    public void operatorB(){

    }
}
