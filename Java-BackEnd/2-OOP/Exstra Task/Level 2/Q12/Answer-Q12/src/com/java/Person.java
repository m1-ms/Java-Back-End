package com.java;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative");
        }
    }

    public void printPersonInfo() {
        System.out.println(" - Age Person : " + age);
        System.out.println(" - Name Person : " + name);
    }
}