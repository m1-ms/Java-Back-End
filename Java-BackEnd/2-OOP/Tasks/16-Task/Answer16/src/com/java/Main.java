package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" --- Welcome in My Restaurant ;) --- ");
        System.out.println(" ");

        // Start
        System.out.print("Do you want to place an order? (yes/no): ");
        String wantOrder = scanner.nextLine();

        if (!wantOrder.equalsIgnoreCase("yes")) {
            System.out.println("Thank you , Goodbye.");
            return;
        }

        // Menu List - 8
        List<Food> menu = new ArrayList<>();
        menu.add(new Food()); menu.get(0).setNameFood(" Burger ");
        menu.get(0).setPriceFood(50);
        menu.add(new Food()); menu.get(1).setNameFood(" Pizza ");
        menu.get(1).setPriceFood(80);
        menu.add(new Food()); menu.get(2).setNameFood(" Pasta ");
        menu.get(2).setPriceFood(60);
        menu.add(new Food()); menu.get(3).setNameFood(" Salad ");
        menu.get(3).setPriceFood(30);
        menu.add(new Food()); menu.get(4).setNameFood(" Sandwich ");
        menu.get(4).setPriceFood(40);
        menu.add(new Food()); menu.get(5).setNameFood(" Fries ");
        menu.get(5).setPriceFood(20);
        menu.add(new Food()); menu.get(6).setNameFood(" Juice ");
        menu.get(6).setPriceFood(15);
        menu.add(new Food()); menu.get(7).setNameFood(" IceCream ");
        menu.get(7).setPriceFood(25);

        // Customer order
        List<Food> orderFoods = new ArrayList<>();
        boolean ordering = true;

        while (ordering) {
            System.out.println(" Food Menu : ");
            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i+1) + ". " + menu.get(i).getNameFood() + " - $" + menu.get(i).getPriceFood());
            }

            System.out.print(" Select food number : ");
            int choice = scanner.nextInt();
            scanner.nextLine(); //skip line

            if (choice >= 1 && choice <= menu.size()) {
                orderFoods.add(menu.get(choice - 1));
            } else {
                System.out.println("Invalid choice.");
            }

            System.out.print(" > Do you want something else? (yes/no): < ");
            String more = scanner.nextLine();
            if (!more.equalsIgnoreCase("yes")) {
                ordering = false;
            }
        }

        // Customer details
        System.out.println("\n --- Please enter your details : ---");
        System.out.print(" - Full Name : ");
        String name = scanner.nextLine();
        System.out.print(" - Address : ");
        String address = scanner.nextLine();
        System.out.print(" - Phone Number : ");
        String phone = scanner.nextLine();

        int orderId = 1;
        Person person = new Person();
        person.setNamePerson(name);
        person.setAddressPerson(address);
        person.setPhoneNumberPerson(phone);

        double total = 0;
        for (Food f : orderFoods) total += f.getPriceFood();

        Bill bill = new Bill();
        bill.setIdBill(orderId);
        bill.setTotalPriceBill(total);

        Gift gift = new Gift();

        Order order = new Order();
        order.setId(orderId);
        order.setPerson(person);
        order.setFoods(orderFoods);
        order.setBill(bill);
        order.setGift(gift);

        // Show current order
        System.out.println(" --- Current Order --- ");
        order.showOrder();

        // Gift options
        System.out.println(" -- Choose a gift option ;) : ");
        System.out.println(" 1. 25% discount");
        System.out.println(" 2. Choose an extra meal from your order");

        int giftChoice = scanner.nextInt();
        scanner.nextLine();

        if (giftChoice == 1) {
            double newTotal = total * 0.75;
            bill.setTotalPriceBill(newTotal);
            gift.setNameGift(" 25% Discount ");
            System.out.println(" Discount applied! New total : $" + newTotal);
        } else if (giftChoice == 2) {
            gift.setNameGift("Extra ");
            System.out.println("Choose extra meal from your order:");
            for (int i = 0; i < orderFoods.size(); i++) {
                System.out.println((i+1) + ". " + orderFoods.get(i).getNameFood() + " - $" + orderFoods.get(i).getPriceFood());
            }
            int extra = scanner.nextInt();
            scanner.nextLine();
            if (extra >= 1 && extra <= orderFoods.size()) {
                Food extraFood = orderFoods.get(extra-1);
                orderFoods.add(extraFood);
                total += extraFood.getPriceFood();
                bill.setTotalPriceBill(total);
                System.out.println(" Added " + extraFood.getNameFood() + ". New total : $" + total);
            }
        }

        System.out.println(" --- Final Order --- ");
        order.showOrder();
        System.out.println(" >> Thank you ;) , Have a nice Time ;) .");
    }
}