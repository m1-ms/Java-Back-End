package com.java;

public class ClupFc extends BaseClup{
    //   Fcode of clupFc
    //id , name , number , code

    private int Fcode;

    public int getFcode() {
        return Fcode;
    }

    public void setFcode(int fcode) {
        if (fcode>0){
            this.Fcode = fcode;
        }
        else {
            System.out.println("Invalid in data Code in Club-FC.");
        }
    }

    public void printClupFc(){
        System.out.println(" >> Club - FC << ");
        System.out.println("ID Club-FC : " + getId());
        System.out.println("Name Club-FC : " + getName());
        System.out.println("Number Club-FC : " + getNumber());
        System.out.println("Code Club-FC : " + Fcode);
    }
}