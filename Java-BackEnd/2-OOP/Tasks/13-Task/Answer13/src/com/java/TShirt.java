package com.java;

public class TShirt {

    // T-Shirt DATA
    private int num;
    private String color;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        if (num >= 1 && num < 25){
            this.num = num;
        }
        else {
            System.out.println("Invalid Number of Player.");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.length()>=3 && color.matches("[A-Za-z ]+")){
            this.color = color;
        }
        else {
            System.out.println("Invalid Color of Player.");
        }
    }

    public void printDataTShirt(){
        System.out.println("Shirt Number: " + num);
        System.out.println("Shirt Color: " + color);
    }

}
