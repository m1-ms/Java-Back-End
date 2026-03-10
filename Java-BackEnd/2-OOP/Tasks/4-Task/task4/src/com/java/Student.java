package com.java;

public class Student extends BaseEntity {

    //                - age must be > 7 and < 30


    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>7 && age<30) {
            this.age = age;
        }
        else {
            System.out.println("Invalid data Age.");
        }
    }

    public void printInfoStudent (){
        System.out.println(" > ID : " + getId());
        System.out.println(" > Name : " + getName());
        System.out.println(" > Age : " + age);
    }
}
