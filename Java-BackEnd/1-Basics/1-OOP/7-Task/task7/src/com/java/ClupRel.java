package com.java;

public class ClupRel extends BaseClup {
    //   Rcode of clupRel
    //id , name , number , code

    private int Rcode;

    public int getRcode() {
        return Rcode;
    }

    public void setRcode(int rcode) {
        if (rcode > 0){
            this.Rcode = rcode;
        }
        else {
            System.out.println("Invalid in data Code in Club-REL.");
        }
    }

    public void printClupRel(){
        System.out.println(" >> Club - REL << ");
        System.out.println("ID Club-REL : " + getId());
        System.out.println("Name Club-REL : " + getName());
        System.out.println("Number Club-REL : " + getNumber());
        System.out.println("Code Club-REL : " + Rcode);
    }
}
