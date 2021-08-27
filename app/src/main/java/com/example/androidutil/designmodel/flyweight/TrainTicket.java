package com.example.androidutil.designmodel.flyweight;

import java.util.Random;

class TrainTicket implements Ticket{

    String from;
    String to;
    String bunk;
    int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showTicketInfo(String bunk) {
        price = new Random().nextInt(300);
        System.out.println("from:"+from+"\tto:"+to+"\tprice:"+price);
    }
}
