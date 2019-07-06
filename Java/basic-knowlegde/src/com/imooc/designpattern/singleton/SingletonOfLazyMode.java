package com.imooc.designpattern.singleton;

public class SingletonOfLazyMode {

    //1. Private the default constructure method
    private SingletonOfLazyMode(){
    }

    //2.Create the only instance, but NOT init it.
    private static SingletonOfLazyMode instance;

    //3. Supply the getInstance() method for public.
    public static SingletonOfLazyMode getInstance(){
        if (instance == null){
            instance = new SingletonOfLazyMode();
        }

        return instance;
    }

}

