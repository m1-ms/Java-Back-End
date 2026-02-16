package com.java;

public class areaCircle {
    // Area = π*R2
    // π = 3.141592653
    private double r;

    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }

    void printArea (){
        System.out.println(r*r*3.141592653);
    }
}
