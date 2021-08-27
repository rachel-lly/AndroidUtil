package com.example.androidutil.designmodel.facade;

class MobilePhone {
    private Phone phone = new Phone.PhoneImpl();
    private Camera camera = new Camera.CameraImpl();

    public void call() {
        phone.call();
    }

    public void hangup() {
        phone.hangup();
    }

    public void videoChat() {
        camera.open();
        phone.call();
    }


    public void takePicture() {
        camera.open();
        camera.takePicture();
    }


    public void close() {
        camera.close();
    }
}
