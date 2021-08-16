package com.example.androidutil.designmodel.templatemethod;

abstract class AbstractComputer {

    void powOn(){
        System.out.println("powOn");
    }
    void check(){
        System.out.println("check");
    }
    void loadOs(){
        System.out.println("loadOs");
    }
    void login(){
        System.out.println("login");
    }

    public final void startUp(){
        powOn();
        check();
        loadOs();
        login();
    }
}
