package com.example.androidutil.designmodel.proxy;

import java.lang.reflect.Proxy;

class DynamicClient {
    public static void main(String[] args) {
        RealSubject real = new RealSubject();

        //构造一个动态代理
        DynamicProxy dynamicProxy = new DynamicProxy(real);
        ClassLoader loader = real.getClass().getClassLoader();

        //动态构造一个具体的代理者
        RealSubject proxy = (RealSubject) Proxy.newProxyInstance(loader,new Class[]{RealSubject.class},dynamicProxy);
        proxy.visit();//代理实现
    }
}
