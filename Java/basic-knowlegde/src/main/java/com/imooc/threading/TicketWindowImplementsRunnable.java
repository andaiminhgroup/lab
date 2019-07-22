package com.imooc.threading;


class TicketWindow implements Runnable{
    private int ticketsCount = 5;

    @Override
    public void run(){
        while (ticketsCount > 0){
            ticketsCount--;

            System.out.println(Thread.currentThread().getName() + " sold 1 tickets. Left tickets: " + ticketsCount);
        }
    }
}


public class TicketWindowImplementsRunnable {
    public static void main(String[] args){
        TicketWindow ticketWindow = new TicketWindow();
        Thread t1 = new Thread(ticketWindow, "A1");
        Thread t2 = new Thread(ticketWindow, "A2");
        Thread t3 = new Thread(ticketWindow, "A3");

        t1.start();
        t2.start();
        t3.start();
    }
}
