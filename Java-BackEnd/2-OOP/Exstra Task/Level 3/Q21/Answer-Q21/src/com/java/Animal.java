package com.java;

public class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name!=null && name.length()>=3 && name.matches("[A-Za-z ]+")){
            this.name = name;
        }
        else {
            System.out.println(" Invalid Name");
        }
    }

    public void setAge(int age) {
        if (age>0){
            this.age = age;
        }
        else {
            System.out.println(" Invalid Age");
        }
    }

    // Print
    public void eat() {
        System.out.println(name + " is eating...");
    }

    public void sleep() {
        System.out.println(name + " is sleeping...");
    }
}