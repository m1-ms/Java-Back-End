package com.java;

public class BasicDataTypes {
    private int intx;
    private long longx;
    private char charx;
    private float floatx;
    private double doublex;

    // int
    public int getIntx(){
        return intx;
    }
    void setIntx(int intx) {
        this.intx = intx;
    }

    // long
    public long getLongx() {
        return longx;
    }
    void setLongx(long longx) {
        this.longx = longx;
    }

    // char
    public char getCharx() {
        return charx;
    }
    public void setCharx(char charx) {
        this.charx = charx;
    }

    // Float
    public float getFloatx() {
        return floatx;
    }
    public void setFloatx(float floatx) {
        this.floatx = floatx;
    }

    // double
    public double getDoublex() {
        return doublex;
    }
    public void setDoublex(double doublex) {
        this.doublex = doublex;
    }

    // Print
    void print (){
        System.out.println(intx);
        System.out.println(longx);
        System.out.println(charx);
        System.out.println(floatx);
        System.out.println(doublex);
    }
}
