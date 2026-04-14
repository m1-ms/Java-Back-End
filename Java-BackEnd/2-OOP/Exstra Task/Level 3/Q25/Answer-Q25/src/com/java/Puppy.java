package com.java;

public class Puppy extends Dog {

    public Puppy(String name) {
        super(name);
    }

    public void play() {
        System.out.println(name + " is playing...");
    }
}