package com.atvI;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {

    }

    public void makesound(){
        System.out.println("Som genérico do animal: ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
