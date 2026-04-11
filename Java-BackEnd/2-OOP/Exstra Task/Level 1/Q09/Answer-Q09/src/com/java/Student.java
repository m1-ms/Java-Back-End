package com.java;

public class Student {

    // id - name - grade

    private int id;
    private String name;
    private double grade;

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println(" - Invalid ID");
        }
    }

    public void setName(String name) {
        if (name != null && name.length() >= 3 && name.matches("[A-Za-z ]+")) {
            this.name = name;
        } else {
            System.out.println(" - Invalid Name.");
        }
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println(" - Invalid Grade.");
        }
    }

    public boolean isPassed() {
        return grade >= 50;
    }

    public void printStudentInfo() {
        System.out.println(" - Student Info -");
        System.out.println(" ID : " + id);
        System.out.println(" Name : " + name);
        System.out.println(" Grade : " + grade + " %");
        System.out.println(" Result : " + (isPassed() ? "Passed" : "Failed"));
    }
}