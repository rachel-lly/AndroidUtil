package com.example.androidutil.designmodel.mediator;

class CPU extends Colleague{

    private String dataVideo,dataSound;

    public CPU(Mediator mediator) {
        super(mediator);
    }

    public void decodeData(String data){
        //解析数据
        String[] tmp = data.split(",");
        dataVideo = tmp[0];
        dataSound = tmp[1];
        //通知中介者自身状态改变
        mediator.changed(this);
    }

    public String getDataVideo() {
        return dataVideo;
    }

    public String getDataSound() {
        return dataSound;
    }
}
