package com.java;

public class Player extends BaseEntity {

    //                - number length must be <=2       0 1     99

    private int number;

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        if (number > 0 && number < 100) {
            this.number = number;
        }
        else {
            System.out.println("Invalid in data Number.");
        }
    }

    public void printInfoPlayer(){
        System.out.println(" > ID : " + getId());
        System.out.println(" > Name : " + getName());
        System.out.println(" > Number : " + number);
    }
}
