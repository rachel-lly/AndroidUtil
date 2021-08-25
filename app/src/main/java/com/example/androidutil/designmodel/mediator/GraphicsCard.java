package com.example.androidutil.designmodel.mediator;

class GraphicsCard extends Colleague{
    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }
    public void videoPlay(String data){
        System.out.println("video: "+data);
    }
}
