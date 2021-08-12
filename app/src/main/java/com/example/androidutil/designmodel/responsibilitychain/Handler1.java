package com.example.androidutil.designmodel.responsibilitychain;

class Handler1 extends AbstractHandler{
    @Override
    int getHandleLevel() {
        return 1;
    }

    @Override
    void handle(AbstractRequest abstractRequest) {
        System.out.println("Handle1 handle request:"+abstractRequest.getRequestLevel());
    }
}

class Handler2 extends AbstractHandler{
    @Override
    int getHandleLevel() {
        return 2;
    }

    @Override
    void handle(AbstractRequest abstractRequest) {
        System.out.println("Handle2 handle request:"+abstractRequest.getRequestLevel());
    }
}

class Handler3 extends AbstractHandler{
    @Override
    int getHandleLevel() {
        return 3;
    }

    @Override
    void handle(AbstractRequest abstractRequest) {
        System.out.println("Handle3 handle request:"+abstractRequest.getRequestLevel());
    }
}