package com.example.androidutil.designmodel.mediator;

class CDDevice extends Colleague{

    private String data;

    public CDDevice(Mediator mediator) {
        super(mediator);
    }

    public String read(){
        return data;
    }

    public void load(){
        data = "video,sound";
        //通知中介者主板数据改变
        mediator.changed(this);
    }
}
