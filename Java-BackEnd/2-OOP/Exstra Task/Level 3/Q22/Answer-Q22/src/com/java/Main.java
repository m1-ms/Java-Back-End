package com.java;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Body", 3);
        Cat cat = new Cat("Lona", 2);

        dog.eat();
        dog.sleep();

        System.out.println("-----------");

        cat.eat();
        cat.sleep();
    }
}