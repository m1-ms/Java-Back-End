package com.java;

import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        Hello n1 = new Hello();
        n1.setName(name);
        n1.print();



//        String name;
//        name = new String();
//        Scanner scanner = new Scanner(System.in);
//       name = scanner.nextLine();
//        // name = scanner.nextLine();
//        Hello n1 = new Hello(name);
//        n1.hello();
    }
}

