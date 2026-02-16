package com.java;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numa;
        numa = scanner.nextDouble();

        double numb;
        numb = scanner.nextDouble();

        double numc;
        numc = scanner.nextDouble();

        double numd;
        numd = scanner.nextDouble();

        Difference df1 = new Difference();

        df1.setNuma(numa);
        df1.setNumb(numb);
        df1.setNumc(numc);
        df1.setNumd(numd);

        df1.printDef();
    }
}