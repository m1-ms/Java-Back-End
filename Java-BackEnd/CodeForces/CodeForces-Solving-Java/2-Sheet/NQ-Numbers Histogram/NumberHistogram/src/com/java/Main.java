package com.java;

import java.util.Scanner;

public class Main {
  static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    char symbol = scanner.next().charAt(0);
    int num = scanner.nextInt();

    int[] arr = new int[num];

    for (int i = 0; i < num; i++) {
      arr[i] = scanner.nextInt();
    }

    NumHistogram numHis = new NumHistogram();
    numHis.setNums(arr);
    numHis.setSymbol(symbol);

    numHis.printNumHistogram();
  }
}