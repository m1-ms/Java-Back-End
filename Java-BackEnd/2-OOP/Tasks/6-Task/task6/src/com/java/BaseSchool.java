package com.java;

public class BaseSchool {
//    accept id , name

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0){
            this.id = id;
        }
        else {
            System.out.println("Invalid data in ID.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length()>=3 && name.matches("[a-zA-Z]+")){
            this.name = name;
        }
        else {
            System.out.println("Invalid data in Name.");
        }
    }
}
