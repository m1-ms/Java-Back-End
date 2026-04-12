package com.java;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Ali", 85);
        student.printStudentInfo();

        student.setGrade(150);

        System.out.println("After invalid update:");
        System.out.println("Grade: " + student.getGrade());
    }
}