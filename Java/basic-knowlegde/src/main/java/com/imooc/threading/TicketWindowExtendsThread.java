package com.imooc.threading;

class TicketWindowThread extends Thread{
    private int ticketsCount = 5;

    private String name;

    public TicketWindowThread(String name){
        this.name = name;
    }

    @Override
    public void run(){
        while (ticketsCount > 0){
            ticketsCount--;

            System.out.println(name + " sold 1 tickets. Left tickets: " + ticketsCount);
        }
    }
}


public class TicketWindowExtendsThread {

    public static void main(String[] args){
        TicketWindowThread a1 = new TicketWindowThread("A1");
        TicketWindowThread a2 = new TicketWindowThread("A2");
        TicketWindowThread a3 = new TicketWindowThread("A3");

        a1.start();
        a2.start();
        a3.start();
    }
}
