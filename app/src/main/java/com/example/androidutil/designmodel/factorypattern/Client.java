package com.example.androidutil.designmodel.factorypattern;

class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product p = factory.createProduct(ProductB.class);
        p.method();
    }

}

class ProductA extends Product{

    @Override
    public void method() {
        System.out.println("---A---");
    }
}


class ProductB extends Product{

    @Override
    public void method() {
        System.out.println("---B---");
    }
}