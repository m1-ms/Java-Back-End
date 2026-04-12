package com.java;

public class Student {

    // student > id / name

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        if (id>0){
            this.id = id;
        }
        else {
            System.out.println(" - Invalid ID.");
        }
    }

    public void setName(String name) {
        if (name!=null && name.length()>=3 && name.matches("[A-Za-z ]+")){
            this.name = name;
        }
        else {
            System.out.println(" - Invalid Name.");
        }
    }
}
