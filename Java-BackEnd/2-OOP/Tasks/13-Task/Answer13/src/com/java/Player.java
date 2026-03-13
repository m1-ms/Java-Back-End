package com.java;

public class Player {

    // Player DATA
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= 1){
            this.id = id;
        }
        else {
            System.out.println("Invalid Number of Player.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=3 && name.matches("[A-Za-z ]+")){
            this.name = name;
        }
        else {
            System.out.println("Invalid Name of Player.");
        }
    }

    public void printDataPlayer(){
        System.out.println("Player ID : " + id);
        System.out.println("Player Name : " + name);
    }

}
