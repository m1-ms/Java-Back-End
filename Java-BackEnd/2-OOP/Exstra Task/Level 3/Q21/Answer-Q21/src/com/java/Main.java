package com.java;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog("Rox", 5);
        Animal cat = new Cat("katy", 2);

        // Dog
        dog.eat();
        dog.sleep();

        System.out.println("-----------------");

        // Cat
        cat.eat();
        cat.sleep();
    }
}