package com.java;

public class Student {
    // id - name - grade

    private int id;
    private String nameStudent;
    private double grade;
    private School school;

    public int getId() {
        return id;
    }

    public String getNameStudent() {
        return nameStudent;
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

    public void setNameStudent(String nameStudent) {
        if (nameStudent!=null && nameStudent.length()>=3 && nameStudent.matches("[A-Za-z ]+")){
            this.nameStudent = nameStudent;
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

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
//    public void printStudentInfo(){
//        System.out.println(" ");
//        System.out.println(" -------------------------------------------- ");
//        System.out.println(" ");
//        System.out.println(" >>  Student Data  << ");
//        System.out.println(" * Student Id : " + id);
//        System.out.println(" * Student Name : " + nameStudent);
//        System.out.println(" * Student Grade : " + grade + " %");
//    }
}
