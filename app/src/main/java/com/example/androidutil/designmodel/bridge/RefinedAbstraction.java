package com.example.androidutil.designmodel.bridge;

class RefinedAbstraction extends Abstraction{
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void refinedOperation(){
        //对Abstraction方法进行扩展
    }
}
