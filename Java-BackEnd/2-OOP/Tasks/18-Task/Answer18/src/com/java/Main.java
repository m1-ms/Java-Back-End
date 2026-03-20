package com.java;

import pack1.Player;
import pack2.Captain;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Player> players = new ArrayList<>();
        ArrayList<Captain> captains = new ArrayList<>();

        System.out.println(" --> Hello In My Club <-- ");

        Player player = null;
        Captain captain = null;
        while (true) {

            System.out.println("\n1- Add Player");
            System.out.println("2- Add Captain");
            System.out.println("0- Exit");

            int choice;

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Enter number:");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                System.out.print("Enter Player ID: ");
                int idPlayer;
                idPlayer = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter Player Name: ");
                String namePlayer;
                namePlayer = scanner.nextLine();

                System.out.print("Enter Player Phone: ");
                String phoneNumberPlayer;
                phoneNumberPlayer = scanner.nextLine();

                player = new Player();
                player.setIdPlayer(idPlayer);
                player.setNamePlayer(namePlayer);
                player.setNumberPlayer(phoneNumberPlayer);
                player.printPlayerInfo();

                System.out.println(" - Added Player:");
                System.out.println(player);

            } else if (choice == 2) {

                System.out.print("Enter Captain ID: ");
                int idCaptain;
                idCaptain = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter Captain Name: ");
                String nameCaptain;
                nameCaptain = scanner.nextLine();

                System.out.print("Is Active (true/false): ");
                boolean activeCaptain;
                activeCaptain = scanner.nextBoolean();
                scanner.nextLine();

                captain = new Captain();
                captain.setIdCaptain(idCaptain);
                captain.setNameCaptain(nameCaptain);
                captain.setActiveCaptain(activeCaptain);
                captain.printCaptainInfo();

                System.out.println(" - Added Captain:");
                System.out.println(captain);

            } else if (choice == 0) {
                break;
            } else {
                System.out.println("Invalid choice!");
                continue;
            }

            System.out.println("Do you want to add another? (yes/no)");
            String again = scanner.nextLine();

            if (!again.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println(" === Final Data ===");
        player.printPlayerInfo();
        captain.printCaptainInfo();
    }
}