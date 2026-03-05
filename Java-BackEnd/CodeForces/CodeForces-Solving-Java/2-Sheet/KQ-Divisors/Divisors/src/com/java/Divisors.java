package com.java;

import java.util.ArrayList;
import java.util.List;

public class Divisors {
    private int num;

    public Divisors(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    // ChatGPT : Help me here
    public List<Integer> findDivis(){
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }
}
