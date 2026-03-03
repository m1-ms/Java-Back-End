package com.java;

public class SumEven {

//    Please Create App that accept 3 number and return sum of them (with oop)
//    look:
//            - check that 3 number must be even number

    private long num1;
    private long num2;
    private long num3;

    public long getNum1() {
        return num1;
    }

    public void setNum1(long num1) {
        if (num1 % 2 == 0) {
            this.num1 = num1;
        }
        else {
            System.out.println("Number First not Even.");
        }
    }

    public long getNum2() {
        return num2;
    }

    public void setNum2(long num2) {
        if (num2 % 2 == 0) {
            this.num2 = num2;
        }
        else {
            System.out.println("Number Second not Even.");
        }
    }

    public long getNum3() {
        return num3;
    }

    public void setNum3(long num3) {
        if (num3 % 2 == 0) {
            this.num3 = num3;
        }
        else {
            System.out.println("Number Third not Even.");
        }
    }

    public void PrintSum(){
            System.out.println("Resalt Sum : " + (num1 + num2 + num3));
    }
}
