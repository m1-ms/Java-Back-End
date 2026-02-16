package com.java;

public class Student {

//    Please Create App that accept id , name and age of Student and print them

    private int id;
    private String name;
    private int age;

    // ID
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // Name
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    // AGE
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Student Information");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
