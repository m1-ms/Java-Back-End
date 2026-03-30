package com.java;

public class Person {
    // Person >> Name / Age

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length()>=3 && name.matches("[A-Za-z ]+")){
            this.name = name;
        }
        else {
            System.out.println(" - Invalid Name. ");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0 && age<=100){
            this.age = age;
        }
        else {
            System.out.println(" - Invalid Age.");
        }
    }
    public void printDataPerson(){
        System.out.println( " -------------------------------------------- ");
        System.out.println(" ");
        System.out.println(" > -- Person Info -- <");
        System.out.println(" - Name Person : " + name);
        System.out.println(" - Age Person : " + age);
    }
}
