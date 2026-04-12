package com.java;

public class Student {

    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        setGrade(grade);
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Grade must be between 0 and 100");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!=null && name.length()>=3 && name.matches("[A-Za-z ]+")){
            this.name = name;
        }
        else{
            System.out.println(" Invalid Name");
        }
    }

    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}