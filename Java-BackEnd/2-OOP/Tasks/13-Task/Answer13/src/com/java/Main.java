package com.java;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        // id - name - number - color
        Scanner scanner = new Scanner(System.in);

        // ID
        System.out.print("Enter ID Player : ");
        int id;
        id = scanner.nextInt();
        scanner.nextLine();

        // NAME
        System.out.print("Enter Name Player : ");
        String name;
        name = scanner.nextLine();

        // NUMBER
        System.out.print("Enter Number T-Shirt Player : ");
        int number;
        number = scanner.nextInt();
        scanner.nextLine();

        // COLOR
        System.out.print("Enter Color T-Shirt Player : ");
        String color;
        color = scanner.nextLine();

        System.out.println("");
        System.out.println(" -------------------------------- ");
        System.out.println("");
        System.out.println("Player Data ... ");
        Player player = new Player();
        player.setId(id);
        player.setName(name);
        player.printDataPlayer();

        TShirt tShirt = new TShirt();
        tShirt.setNum(number);
        tShirt.setColor(color);
        tShirt.printDataTShirt();

    }
}