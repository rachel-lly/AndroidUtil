package com.example.androidutil.designmodel.responsibilitychain;

abstract class AbstractRequest {

    private Object obj;

    public AbstractRequest(Object obj) {
        this.obj = obj;
    }

    public Object getContent(){
        return obj;
    }

    public abstract int getRequestLevel();

}
