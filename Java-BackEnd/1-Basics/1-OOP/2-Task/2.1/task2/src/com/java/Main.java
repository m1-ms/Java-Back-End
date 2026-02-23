package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name Player : ");
        String name;
        name = scanner.nextLine();

        System.out.print("Enter number Player : ");
        long number;
        number = scanner.nextLong();

        Player player = new Player();
        player.setName(name);
        player.setNumber(number);
        player.PrintPlayer();
    }
}