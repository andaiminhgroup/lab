package com.imooc.designpattern.singleton;

public class SingletonOfEagerMode {

    //1. Private the default constructure method
    private SingletonOfEagerMode(){
    }

    //2.Create the only instance and init it.
    private static SingletonOfEagerMode instance = new SingletonOfEagerMode();

    //3. Supply the getInstance() method for public.
    public static SingletonOfEagerMode getInstance(){
        return instance;
    }

}

