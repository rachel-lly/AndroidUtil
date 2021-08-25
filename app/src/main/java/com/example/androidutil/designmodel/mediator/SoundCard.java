package com.example.androidutil.designmodel.mediator;

class SoundCard extends Colleague{
    public SoundCard(Mediator mediator) {
        super(mediator);
    }
    public void soundPlay(String data){
        System.out.println("sound: "+data);
    }
}
