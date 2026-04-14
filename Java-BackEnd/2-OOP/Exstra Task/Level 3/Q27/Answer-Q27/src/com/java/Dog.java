package com.java;

public class Dog extends Parent {

    public Dog(String name) {
        super(name);
    }

    public void display() {
        System.out.println("Dog name is: " + name);
    }
}