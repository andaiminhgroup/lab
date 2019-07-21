package com.imooc.threading;

class SolderWindowA extends Thread{
    private int ticketsCount = 5;

    private String name;

    public SolderWindowA(String name){
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


public class Main {

    public static void main(String[] args){
        SolderWindowA a1 = new SolderWindowA("A1");
        SolderWindowA a2 = new SolderWindowA("A2");
        SolderWindowA a3 = new SolderWindowA("A3");

        a1.start();
        a2.start();
        a3.start();
    }
}
