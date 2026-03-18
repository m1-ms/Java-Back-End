package com.java;

public class SomeSums {

    private int N;
    private int A;
    private int B;

    public int getN() {
        return N;
    }

    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }

    public void setN(int n) {
        if (n >= 1 && n <= 100000) {
            N = n;
        } else {
            System.out.println("Invalid N");
        }
    }

    public void setA(int a) {
        if (a >= 1 && a <= 36) {
            A = a;
        } else {
            System.out.println("Invalid A");
        }
    }

    public void setB(int b) {
        if (b >= 1 && b <= 36) {
            B = b;
        } else {
            System.out.println("Invalid B");
        }
    }
    private int logicSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public int calcSum() {
        int total = 0;

        for (int i = 1; i <= N; i++) {
            int s = logicSum(i);

            if (s >= A && s <= B) {
                total += i;
            }
        }
        return total;
    }
}