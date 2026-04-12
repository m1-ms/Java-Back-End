package com.java;

public final class Student {

    private final int id;
    private final String name;
    private final double grade;

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

}