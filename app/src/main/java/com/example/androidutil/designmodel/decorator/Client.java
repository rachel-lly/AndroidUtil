package com.example.androidutil.designmodel.decorator;

class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        Decorator decorator = new ConcreteDecoratorA(component);
        decorator.operate();
    }
}
