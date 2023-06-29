package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    public String getDescription(){
        String str="This animal is mostly "+color+". It has "+numberOfPaws;
        if(numberOfPaws==1)
            str=str+" paw and ";
        else
            str=str+" paws and ";
        if(hasFur==true)
            str=str+"a";
        else
            str=str+"no";
        return str+" fur.";
    }
}
