package com.java;

public class SimpleCalculator {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    void printres(){
        System.out.println(x + " + " + y + " = " + (x+y));
        System.out.println(x + " * " + y + " = " + (x*y));
        System.out.println(x + " - " + y + " = " + (x-y));
    }
}
