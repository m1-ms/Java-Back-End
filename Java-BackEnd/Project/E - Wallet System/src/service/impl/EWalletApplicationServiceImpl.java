package service.impl;

import exception.*;
import model.Account;
import model.EWalletSystem;
import service.AccountService;
import service.ApplicationService;
import service.WalletService;
import java.util.Scanner;

public class EWalletApplicationServiceImpl implements ApplicationService {

    private EWalletSystem wallet = new EWalletSystem();
    private AccountService accountService = new AccountService(wallet);
    private WalletService walletService = new WalletService(wallet);
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void startApp() {
        System.out.println("--------------------------------------------");
        System.out.println("  Welcome to " + wallet.getName());
        System.out.println("--------------------------------------------");

        boolean running = true;
        while (running) {
            System.out.println("1- Register");
            System.out.println("2- Login");
            System.out.println("0- Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> register();
                case 2 -> login();
                case 0 -> {
                    System.out.println("Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private void register() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Username: ");
        String userName = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        try {
            accountService.register(name, userName, password, phone, email, age);
        } catch (AccountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void login() {
        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Username: ");
            String userName = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            try {
                Account account = accountService.login(userName, password);
                showMenu(account);
                return;
            } catch (AccountException e) {
                attempts++;
                System.out.println("Error: " + e.getMessage());
                System.out.println("Attempts left: " + (3 - attempts));
            }
        }
        System.out.println("Too many failed attempts!");
    }

    private void showMenu(Account account) {
        boolean loggedIn = true;
        while (loggedIn) {
            System.out.println("--- " + account.getName() + " ---");
            System.out.println("Balance: " + account.getBalance());
            System.out.println("1- Deposit");
            System.out.println("2- Withdraw");
            System.out.println("3- Transfer");
            System.out.println("4- Account Details");
            System.out.println("0- Logout");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> deposit(account);
                case 2 -> withdraw(account);
                case 3 -> transfer(account);
                case 4 -> showDetails(account);
                case 0 -> {
                    System.out.println("Logged out!");
                    loggedIn = false;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private void deposit(Account account) {
        System.out.print("Amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        try {
            walletService.deposit(account.getUserName(), amount);
        } catch (AccountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void withdraw(Account account) {
        System.out.print("Amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        try {
            walletService.withdraw(account.getUserName(), amount);
        } catch (AccountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void transfer(Account account) {
        System.out.print("To Username: ");
        String toUser = scanner.nextLine();
        System.out.print("Amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        try {
            walletService.transfer(account.getUserName(), toUser, amount);
        } catch (AccountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void showDetails(Account account) {
        System.out.println("--- Account Details ---");
        System.out.println("Name: " + account.getName());
        System.out.println("Username: " + account.getUserName());
        System.out.println("Phone: " + account.getPhoneNumber());
        System.out.println("Email: " + account.getEmail());
        System.out.println("Age: " + account.getAge());
        System.out.println("Balance: " + account.getBalance());
    }
}