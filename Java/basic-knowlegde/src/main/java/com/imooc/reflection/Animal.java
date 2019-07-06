package com.imooc.reflection;

public class Animal implements Life{

    public String description = "A kind of living being which can move and sense.";

    public void grow(){
        System.out.println("I'm a growing animal...");
    }

    private int age = 0;

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
}
