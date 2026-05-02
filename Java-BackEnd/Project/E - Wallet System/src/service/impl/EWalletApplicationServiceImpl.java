package service.impl;

import exception.*;
import model.Account;
import model.EWalletSystem;
import model.Transaction;
import service.AccountService;
import service.ApplicationService;
import service.WalletService;
import java.util.Scanner;

public class EWalletApplicationServiceImpl implements ApplicationService {

    private EWalletSystem wallet = new EWalletSystem();
    private AccountService accountService = new AccountServiceImpl(wallet);
    private WalletService walletService = new WalletServiceImpl(wallet);
    private Scanner scanner = new Scanner(System.in);       // Input Element [Scanner]


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
        int attempt = 0;

        while (attempt<3){
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
            attempt++;
            continue;
        }

        try {
            accountService.register(name, userName, password, phone, email, age);
            return;
        } catch (AccountException accountException) {
            attempt++;
            System.out.println(" - Error : " + accountException.getMessage());
            System.out.println(" Attempts Left : " + (3 - attempt));
        }
    }
    System.out.println(" Too many Failed Attempts!");
    System.out.println(" Returning to Main Menu...");
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
                if (account.isAdmin()){
                    showAdminMenu(account);
                } else {
                    showMenu(account);
                }
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

    // View All Accounts
    private void viewAllAccounts() {
        System.out.println(" --- || All Accounts || --- ");

        int index = 1;
        for (Account account : wallet.getAccounts()) {
            System.out.println(" [ " + index + " ]");
            System.out.println(" - Name     : " + account.getName());
            System.out.println(" - Username : " + account.getUserName());
            System.out.println(" - Phone    : " + account.getPhoneNumber());
            System.out.println(" - Email    : " + account.getEmail());
            System.out.println(" - Balance  : " + account.getBalance());
            System.out.println(" - Admin    : " + account.isAdmin());
            System.out.println(" ------------------------------------------------ ");
            index++;
        }
    }

    // Admin Menu User
    private void showAdminMenu(Account account){
        boolean loggedIn = true;
        while (loggedIn){
            System.out.println(" --- || Admin DashBoard || --- ");
            System.out.println(" [ 1 ] - View All Accounts");
            System.out.println(" [ 2 ] - My Account Balance");
            System.out.println(" [ 0 ] - LogOut");
            System.out.print(" Enter your Choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1 -> viewAllAccounts();
                case 2 -> showMenu(account);
                case 0 -> {
                    System.out.println(" Logged Out!");
                    loggedIn = false;
                }
                default -> System.out.println(" Invalid Your Choice. ");
            }
        }
    }

    // UserMenu
    private void showMenu(Account account) {

        int invalidCount = 0;
        boolean loggedIn = true;

        while (loggedIn) {
            System.out.println(" --- || " + account.getName() + " Account " + " || ---");
            System.out.println(" Balance : " + account.getBalance());
            System.out.println(" [ 1 ] - Deposit");
            System.out.println(" [ 2 ] - Withdraw");
            System.out.println(" [ 3 ] - Transfer");
            System.out.println(" [ 4 ] - Account Details");
            System.out.println(" [ 5 ] - Change Password");
            System.out.println(" [ 6 ] - Transaction History");  // Bonus
            System.out.println(" [ 7 ] - Delete Account");       // Bonus
            System.out.println(" [ 8 ] - InActive Account");     // Bonus
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
                case 6 -> showTransactionHistory(account);
                case 7 -> { if (deleteAccount(account)) loggedIn = false; }
                case 8 -> { if (inactiveAccount(account)) loggedIn = false; }
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
        System.out.print(" Amount (0 to Back) : ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        if (amount == 0) {
            System.out.println(" Going Back...");
            return;
        }

        try {
            walletService.deposit(account.getUserName(), amount);
        } catch (AccountException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }

    // WithDraw
    private void withdraw(Account account) {
        System.out.println(" -- || WithDraw || -- ");
        System.out.print(" Amount (0 to Back) : ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        if (amount == 0) {
            System.out.println(" Going Back...");
            return;
        }

        try {
            walletService.withdraw(account.getUserName(), amount);
        } catch (AccountException accountException) {
            System.out.println(" Error : " + accountException.getMessage());
        }
    }

    // Transfer
    private void transfer(Account account) {
        System.out.println(" -- || Transfer || -- ");
        System.out.print(" To UserName (0 to Back) : ");
        String toUser = scanner.nextLine();

        if (toUser.equals("0")) {
            System.out.println(" Going Back...");
            return;
        }

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

    // Transaction History
    private void showTransactionHistory(Account account) {
        System.out.println(" --- || Account Transaction History || --- ");
        // Updated Account
        Account updated = wallet.findByUserName(account.getUserName());

        if (updated.getTransactions().isEmpty()) {
            System.out.println(" No transactions yet.");
            return;
        }

        int index = 1;
        for (Transaction t : updated.getTransactions()) {
            System.out.println(" [ " + index + " ] " + t);
            index++;
        }
    }

    // Delete Account
    private boolean deleteAccount(Account account){
        System.out.println(" -- || Delete Account || -- ");
        System.out.print(" - Enter Password to Confirm : ");
        String password = scanner.nextLine();

        try {
            accountService.deleteAccount(account.getUserName(),password);
            System.out.println(" ....... Logging Out , Bye ");
            return true;
        } catch (AccountException accountException) {
            System.out.println(" " + accountException.getMessage());
            return false;
        }
    }

    // Inactive Account
    private boolean inactiveAccount(Account account) {
        System.out.println(" -- || Inactive Account || -- ");
        System.out.print(" - Enter Password to Confirm : ");
        String password = scanner.nextLine();

        try {
            accountService.inActive(account.getUserName(), password);
            // logout after inActive
            System.out.println(" ...... Logging out...");
            return true;
        } catch (AccountException accountException) {
            System.out.println(" " + accountException.getMessage());
            return false;
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