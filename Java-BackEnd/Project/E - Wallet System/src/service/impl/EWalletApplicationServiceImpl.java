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
    private AccountService accountService = new AccountServiceImpl(wallet);
    private WalletService walletService = new WalletService(wallet);
    // Input Element
    private Scanner scanner = new Scanner(System.in);


    // StartApp
    @Override
    public void startApp() {
        System.out.println(" -------------------------------------------- ");
        System.out.println("  Welcome to " + wallet.getName());
        System.out.println(" -------------------------------------------- ");

        boolean running = true;
        int invalidCount = 0;

        while (running) {
            System.out.println(" [ 1 ] - Register");
            System.out.println(" [ 2 ] - Login");
            System.out.println(" [ 0 ] - Exit");
            System.out.print(" Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> register();
                case 2 -> login();
                case 0 -> {
                    System.out.println(" -- Good Bye! ");
                    running = false;
                }
                default -> {
                    System.out.println(" Invalid choice.");
                    System.out.println(" Please try Again.");
                    invalidCount ++;
                }
            }

            // Too many Invalid
            if (invalidCount == 4) {
                System.out.println(" Too many Invalid.");
                System.out.println(" -- Good Bye!");
                running = false;
            }

        }
    }

    // Register Data
    private void register() {
        System.out.println(" -- || Register || -- ");
        System.out.print(" - Name : ");
        String name = scanner.nextLine();
        System.out.print(" - UserName : ");
        String userName = scanner.nextLine();
        System.out.print(" - Password : ");
        String password = scanner.nextLine();
        System.out.print(" - PhoneNumber : ");
        String phone = scanner.nextLine();
        System.out.print(" - E-Mail : ");
        String email = scanner.nextLine();
        System.out.print(" - Age : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        // Validate
        if (name.isBlank() || userName.isBlank() || password.isBlank()
                || phone.isBlank() || email.isBlank()) {
            System.out.println(" All fields are required!");
            return;
        }

        try {
            accountService.register(name, userName, password, phone, email, age);
        } catch (AccountException accountException) {
            System.out.println(" - Error : " + accountException.getMessage());
        }
    }

    // Login
    private void login() {
        System.out.println(" -- || Login || -- ");
        int attempts = 0;
        while (attempts < 3) {
            System.out.print(" UserName : ");
            String userName = scanner.nextLine();
            System.out.print(" Password : ");
            String password = scanner.nextLine();

            // Validate
            if (userName.isBlank() || password.isBlank()) {
                System.out.println(" Username and password are Required!");
                attempts++;
                continue;
            }

            try {
                Account account = accountService.login(userName, password);
                showMenu(account);
                return;
            } catch (AccountException accountExcept) {
                attempts++;
                System.out.println(" Error: " + accountExcept.getMessage());
                System.out.println(" Attempts Left : " + (3 - attempts));
            }
        }

        System.out.println(" Too many Failed Attempts!");
        System.out.println(" Please try Again Later.");
    }

    // UserMenu
    private void showMenu(Account account) {

        int invalidCount = 0;
        boolean loggedIn = true;

        while (loggedIn) {
            System.out.println(" --- || " + account.getName() + " || ---");
            System.out.println(" Balance : " + account.getBalance());
            System.out.println(" [ 1 ] - Deposit");
            System.out.println(" [ 2 ] - Withdraw");
            System.out.println(" [ 3 ] - Transfer");
            System.out.println(" [ 4 ] - Account Details");
            System.out.println(" [ 5 ] - Change Password");
            System.out.println(" [ 0 ] - LogOut");
            System.out.print(" Enter your Choice : ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> deposit(account);
                case 2 -> withdraw(account);
                case 3 -> transfer(account);
                case 4 -> showDetails(account);
                case 5 -> changePassword(account);
                case 0 -> {
                    System.out.println(" Logged Out! ");
                    System.out.println(" Good Bye! ");
                    loggedIn = false;
                }
                default -> {
                    System.out.println(" Invalid Choice , Please try Again. ");
                    invalidCount ++;
                }
            }

            // Too many Invalid
            if (invalidCount == 4) {
                System.out.println("Too many invalid attempts. Logging out!");
                loggedIn = false;
            }

        }
    }

    // Deposit
    private void deposit(Account account) {
        System.out.println(" -- || Deposit || -- ");
        System.out.print(" Amount : ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        try {
            walletService.deposit(account.getUserName(), amount);
        } catch (AccountException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }

    // WithDraw
    private void withdraw(Account account) {
        System.out.println(" -- || WithDraw || -- ");
        System.out.print(" Amount : ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        try {
            walletService.withdraw(account.getUserName(), amount);
        } catch (AccountException accountException) {
            System.out.println(" Error : " + accountException.getMessage());
        }
    }

    // Transfer
    private void transfer(Account account) {
        System.out.println(" -- || Transfer || -- ");
        System.out.print(" To UserName : ");
        String toUser = scanner.nextLine();
        System.out.print(" Amount : ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        try {
            walletService.transfer(account.getUserName(), toUser, amount);
        } catch (AccountException exception) {
            System.out.println(" Error : " + exception.getMessage());
        }
    }

    // Change Password
    private void changePassword(Account account){
        System.out.println(" -- || Change Password || -- ");

        System.out.println(" - Enter Old Password : ");
        String oldPassword = scanner.nextLine();

        System.out.println(" - Enter New Password : ");
        String newPassword = scanner.nextLine();

        try {
            accountService.changePassword(account, oldPassword, newPassword);
        } catch (AccountException accountException) {
            System.out.println(" Error : " + accountException.getMessage());
        }
    }

    // Show Details
    private void showDetails(Account account) {
        System.out.println(" --- || Account Details || --- ");
        System.out.println(" - Name : " + account.getName());
        System.out.println(" - UserName : " + account.getUserName());
        System.out.println(" - PhoneNumber : " + account.getPhoneNumber());
        System.out.println(" - E-Mail : " + account.getEmail());
        System.out.println(" - Age : " + account.getAge());
        System.out.println(" - Balance : " + account.getBalance());
    }
}