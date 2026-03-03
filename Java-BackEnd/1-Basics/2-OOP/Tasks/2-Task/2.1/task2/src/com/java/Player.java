package com.java;

public class Player {

    private String name;     // name > 5
    private long number;     // number > 0

//     - make sure that number is > 0
//     - make sure that name size > 5

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 5){
            this.name = name;
        }
        else {
            System.out.println("Error Data Name.");
        }
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        if (number > 0) {
            this.number = number;
        }
        else {
            System.out.println("Error Data Number.");
        }
    }

    public void PrintPlayer (){
        System.out.println("______________________________________");
        System.out.println("Player Info.");
        System.out.println("Name : " + name);
        System.out.println("Number : " + number);
    }
}
