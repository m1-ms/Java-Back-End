package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        List<Number> numberList = new ArrayList<>();

        for (int i = 0; i < N; i++){

            int number = scanner.nextInt();

            Number numbers = new Number(number);

            numberList.add(numbers);
        }

        LogicNumber analyzer = new LogicNumber();

        analyzer.logic(numberList);

        analyzer.printResult();
    }
}