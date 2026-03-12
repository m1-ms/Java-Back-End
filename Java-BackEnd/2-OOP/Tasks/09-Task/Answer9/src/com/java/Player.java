package com.java;

public class Player {
    //  id ,  name , age
    private int id;
    private String name;
    private int age;
    private String phoneNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id>0){
            this.id = id;
        }
        else {
            System.out.println("Invalid ID.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=3 && name.matches("[A-Za-z]+")){
            this.name = name;
        }
        else {
            System.out.println("Invalid Name.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=10 && age<=80){
            this.age = age;
        }
        else {
            System.out.println("Invalid Age.");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("[0-9]+")){
            this.phoneNumber = phoneNumber;
        }
        else {
            System.out.println("Invalid PhoneNumber.");
        }
    }
    public void showPlayer() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number : " + phoneNumber);
    }
}
