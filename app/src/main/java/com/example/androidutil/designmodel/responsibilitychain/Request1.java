package com.example.androidutil.designmodel.responsibilitychain;

class Request1 extends AbstractRequest{
    public Request1(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 1;
    }
}

class Request2 extends AbstractRequest{
    public Request2(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 2;
    }
}

class Request3 extends AbstractRequest{
    public Request3(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 3;
    }
}