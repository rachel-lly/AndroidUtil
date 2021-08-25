package com.example.androidutil.designmodel.mediator;

class Client {
    public static void main(String[] args) {
        
        MainBoard mediator = new MainBoard();
        
        CDDevice cdDevice = new CDDevice(mediator);
        CPU cpu = new CPU(mediator);
        GraphicsCard graphicsCard = new GraphicsCard(mediator);
        SoundCard soundCard = new SoundCard(mediator);
        
        mediator.setCdDevice(cdDevice);
        mediator.setCpu(cpu);
        mediator.setGraphicsCard(graphicsCard);
        mediator.setSoundCard(soundCard);
        
        cdDevice.load();
        
    }
}
