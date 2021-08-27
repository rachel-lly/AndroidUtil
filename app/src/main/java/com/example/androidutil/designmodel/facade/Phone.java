package com.example.androidutil.designmodel.facade;

interface Phone {
    void call();
    void hangup();

    class PhoneImpl implements Phone{

        @Override
        public void call() {
            System.out.println("call");
        }

        @Override
        public void hangup() {
            System.out.println("hangup");
        }
    }
}
