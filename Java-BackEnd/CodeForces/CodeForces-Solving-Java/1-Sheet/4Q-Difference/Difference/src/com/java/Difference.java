package com.java;

public class Difference {
    //  X=(A*B)-(C*D).
    // Print "Difference = x"

    private double numa;
    private double numb;
    private double numc;
    private double numd;

    public double getNuma() {
        return numa;
    }

    public void setNuma(double numa) {
        this.numa = numa;
    }

    public double getNumb() {
        return numb;
    }

    public void setNumb(double numb) {
        this.numb = numb;
    }

    public double getNumc() {
        return numc;
    }

    public void setNumc(double numc) {
        this.numc = numc;
    }

    public double getNumd() {
        return numd;
    }

    public void setNumd(double numd) {
        this.numd = numd;
    }

    void printDef(){
        System.out.println("Difference = " + ((numa*numb)-(numc*numd)));
    }
}