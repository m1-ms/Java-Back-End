package com.java;

public class LuckNum {
    private int Num;

    public int getNum() {
        return Num;
    }

    public void setNum(int num) {
        Num = num;
    }
    public static boolean Lucky(int Num) {
        if (Num == 0) {
            return false;
        } else {
            while (Num > 0) {
                int digit = Num % 10;
                if (digit != 4 && digit != 7) {
                    return false;
                }
                Num /= 10;
            }
        }
        return true;
    }
}

