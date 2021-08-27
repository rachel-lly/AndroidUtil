package com.example.androidutil.designmodel.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class TicketFactory {
    static Map<String,Ticket> ticketMap = new ConcurrentHashMap<>();

    public static Ticket getTicket(String from,String to){
        String key = from + "-" + to;
        if(ticketMap.containsKey(key)){
            return ticketMap.get(key);
        }else{
            Ticket ticket = new TrainTicket(from,to);
            ticketMap.put(key,ticket);
            return ticket;
        }
    }
}
