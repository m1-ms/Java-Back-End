package com.java;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog("Body", 3);
        Animal cat = new Cat("Lona", 2);

        dog.eat(); // Dog
        cat.eat(); // Cat
    }
}