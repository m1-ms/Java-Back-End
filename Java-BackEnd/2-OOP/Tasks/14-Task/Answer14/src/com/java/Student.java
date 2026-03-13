package com.java;

public class Student {
    // Name
    // Age
    private String firstName;
    private String secondName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length()>=3 && firstName!=null && firstName.matches("[A-Za-z ]+")){
            this.firstName = firstName;
        }
        else {
            System.out.println("Invalid First Name.");
        }
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        if (secondName.length()>=3 && secondName!=null && secondName.matches("[A-Za-z ]+")) {
            this.secondName = secondName;
        }
        else {
            System.out.println("Invalid Second Name.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 8 && age <= 30){
            this.age = age;
        }
        else {
            System.out.println("Invalid Age.");
        }
    }
    public void printStudentData(){
        System.out.println(" > Student Data ... <");
        System.out.println(" - Student First Name : " + firstName);
        System.out.println(" - Student Second Name : " + secondName);
        System.out.println(" - Full Name : " + firstName + " "+ secondName);
        System.out.println(" - Student Age : " + age);
    }
}
