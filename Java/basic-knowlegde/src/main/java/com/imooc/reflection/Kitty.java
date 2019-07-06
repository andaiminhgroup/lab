package com.imooc.reflection;

public class Kitty extends Animal{
    public String description = "I'm a kitty!";

    private String color = "WHITE";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private void poop(){
        System.out.println("This is a private method.");
    }
}
