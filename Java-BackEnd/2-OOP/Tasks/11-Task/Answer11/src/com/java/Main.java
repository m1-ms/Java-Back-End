package com.java;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] menu = {" Pizza " , " Burger " , " Pasta " , " Chicken " , " Fries "};
        boolean run = true;

        while (run){
            System.out.println(" > Restaurant List < \n");
            for (int i=0; i<menu.length; i++){
                System.out.println((i+1) + " - " + menu[i]);
            }

            System.out.print("Choice Number Order : ");
            int choice;
            choice = scanner.nextInt();

            if (choice>=1 && choice<= menu.length){
                Restaurant.addOrder(menu[choice-1]);
            }
            else {
                System.out.println("Choice correct number.");
            }
            System.out.println("You want another order ?  ( Enter Yes / No )");
            String answer;
            scanner.nextLine();
            answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("No")){
                run = false;
            }
        }

        RestaurantService restaurant = new RestaurantService();
        restaurant.showOrder();

        System.out.println("Thank You.");
    }
}