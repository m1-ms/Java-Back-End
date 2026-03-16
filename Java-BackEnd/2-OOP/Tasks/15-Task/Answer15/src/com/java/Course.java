package com.java;

public class Course {
    // name course - id
    private String nameCourse;
    private int id;

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        if (nameCourse!=null && nameCourse.matches("[A-Za-z ]+")){
            this.nameCourse = nameCourse;
        }
        else {
            System.out.println("Invalid Name Course.");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id>0){
            this.id = id;
        }
        else {
            System.out.println("Invalid ID Course.");
        }
    }
}
