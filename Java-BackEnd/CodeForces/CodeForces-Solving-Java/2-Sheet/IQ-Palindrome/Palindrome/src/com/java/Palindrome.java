package com.java;

public class Palindrome {
    private int num;

    public Palindrome(int n) {
        this.num = n;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public int revNumber() {

        int tNum = num;
        int revNum = 0;

        // ChatGPT Help me here
        while (tNum > 0) {
            int digit = tNum % 10;
            revNum = revNum * 10 + digit;
            tNum /= 10;
        }
        return revNum;
    }
    public boolean NPalindrome() {
        return num == revNumber();
    }
}
