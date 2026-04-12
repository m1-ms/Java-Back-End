package com.java;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Ali", 90);

        System.out.println("ID: " + s1.getId());
        System.out.println("Name: " + s1.getName());
        System.out.println("Grade: " + s1.getGrade());

    }
}