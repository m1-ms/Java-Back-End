package com.java;

import java.lang.Math;

public class Calculator {

    //  floor, ceil, round

    private double A;
    private double B;

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }
    public double getFloor(){
        return (double) Math.floor(A/B);
    }
    public double getCeil(){
        return (double) Math.ceil(A /B);
    }
    public double getRound(){
        return (double) Math.round(A/B);
    }

    // Print RES

    public void printCalcuRes(){
        System.out.println("floor " + A + " / " + B + " = " + getFloor());
        System.out.println("ceil " + A + " / " + B + " = " + getCeil());
        System.out.println("round " + A + " / " + B + " = " + getRound());

    }
}
