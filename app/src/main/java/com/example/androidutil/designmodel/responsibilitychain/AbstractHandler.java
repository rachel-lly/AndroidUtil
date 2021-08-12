package com.example.androidutil.designmodel.responsibilitychain;

abstract class AbstractHandler {

    AbstractHandler nextHandler;

    public final void handleRequest(AbstractRequest abstractRequest){
        if(getHandleLevel() == abstractRequest.getRequestLevel()){
            handle(abstractRequest);
        }else{
            if(nextHandler != null){
                nextHandler.handleRequest(abstractRequest);
            }else{
                System.out.println("All of handler can't handle the request");
            }
        }
    }

    abstract int getHandleLevel();

    abstract void handle(AbstractRequest abstractRequest);


}
