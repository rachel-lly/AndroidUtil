package com.example.androidutil.designmodel.Observer;

import java.util.Observable;

class DevTechFrontier extends Observable {

    public void postNewPublication(String content){
        //表示状态或者内容发生改变
        setChanged();
        //通知所有观察者
        notifyObservers(content);
    }
}
