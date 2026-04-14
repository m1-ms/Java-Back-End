package com.java;

public class Parent {

    protected String name;

    public Parent(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Animal name: " + name);
    }
}