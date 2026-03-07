package com.java;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K;
        K = scanner.nextInt();
        int S;
        S = scanner.nextInt();

        TreeNum treeNum = new TreeNum();

        treeNum.setK(K);
        treeNum.setS(S);
        treeNum.printCountTreeNum();
        treeNum.countTreeNum();
    }
}