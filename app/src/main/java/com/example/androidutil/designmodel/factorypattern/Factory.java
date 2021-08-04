package com.example.androidutil.designmodel.factorypattern;

public abstract class Factory {
    public abstract  <T extends Product> T createProduct(Class<T> clz);
}
