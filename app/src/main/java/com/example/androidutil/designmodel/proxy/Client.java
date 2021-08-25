package com.example.androidutil.designmodel.proxy;

class Client {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        ProxySubject proxy = new ProxySubject(realSubject);
        proxy.visit();
    }
}
