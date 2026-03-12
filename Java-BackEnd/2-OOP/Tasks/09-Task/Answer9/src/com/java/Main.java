package com.java;

import javax.lang.model.element.Name;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Data Player ... : ");
        // ID
        System.out.print("Enter ID : ");
        int id;
        id = scanner.nextInt();

        scanner.nextLine();

        // Name
        System.out.print("Enter Name : ");
        String name;
        name = scanner.next();

        scanner.nextLine();

        // Age
        System.out.print("Enter Age : ");
        int age;
        age = scanner.nextInt();

        scanner.nextLine();

        // PhoneNumber
        System.out.print("Enter PhoneNumber : ");
        String phoneNumber;
        phoneNumber = scanner.nextLine();

        Player player = new Player();
        player.setName(name);
        player.setId(id);
        player.setAge(age);
        player.setPhoneNumber(phoneNumber);

        PublicClub publicClub = new PublicClub();
        PrivateClub privateClub = new PrivateClub();

        // ChooseClub
        System.out.println("Choose Club:");
        System.out.println(" > Enter 1 or 2 < ");
        System.out.println("1 - Public Club");
        System.out.println("2 - Private Club");
        System.out.print(" Your Choose : ");
        int choice;
        choice = scanner.nextInt();

        if (choice == 1) {
            publicClub.addPlayer(player);
            System.out.println(" ");
            System.out.println("Successfully Add in Public Club.");
            System.out.println(" ");
        } else if (choice == 2) {
            privateClub.addPlayer(player);
            System.out.println(" ");
            System.out.println("Successfully Add in Private Club.");
            System.out.println(" ");
        } else {
            System.out.println("Invalid choice");
        }

        System.out.println("Player Details:");
        player.showPlayer();
    }

}