package com.java;

public class Student {
    // id - name - grade

    private int id;
    private String name;
    private double grade;

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
        if (id>=1){
            this.id = id;
        }
        else {
            System.out.println(" - Invalid ID. ");
        }
    }

    public void setName(String name) {
        if (name!=null && name.length()>=3 && name.matches("[A-Za-z ]+")){
            this.name = name;
        }
        else {
            System.out.println(" - Invalid Name. ");
        }
    }

    public void setGrade(double grade) {
        if (grade>=1 && grade<=100){
            this.grade = grade;
        }
        else {
            System.out.println(" - Invalid Grade. ");
        }
    }
    public void printStudentInfo(){
        System.out.println(" ");
        System.out.println(" -------------------------------------------- ");
        System.out.println(" ");
        System.out.println(" >>  Student Data  << ");
        System.out.println(" * Student Id : " + id);
        System.out.println(" * Student Name : " + name);
        System.out.println(" * Student Grade : " + grade + " %");
    }
}
