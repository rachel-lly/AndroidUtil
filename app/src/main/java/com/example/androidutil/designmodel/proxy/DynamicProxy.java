package com.example.androidutil.designmodel.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class DynamicProxy implements InvocationHandler {

    private Object obj;

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = method.invoke(obj,args);
        return res;
    }
}
