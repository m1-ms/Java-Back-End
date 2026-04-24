package service.impl;

import exception.*;
import model.Account;
import model.EWalletSystem;
import service.AccountService;

public class AccountServiceImpl implements AccountService {

    private final EWalletSystem walletSystem;

    public AccountServiceImpl(EWalletSystem wallet) {
        this.walletSystem = wallet;
    }

    // Register
    @Override
    public void register(String name, String userName, String password,
                         String phoneNumber, String email, int age) {

        // Check By UserName
        if (walletSystem.findByUserName(userName) != null) {
            throw new AccountException(" UserName already exist : " + userName);
        }

        // Check By PhoneNumber
        if (walletSystem.findByPhone(phoneNumber) != null) {
            throw new AccountException(" PhoneNumber already exist : " + phoneNumber);
        }

        // Check By Email
        if (walletSystem.findByEmail(email) != null) {
            throw new AccountException(" E-Mail already exist : " + email);
        }

        // Create and Store Account
        Account account = new Account(name, userName, password, phoneNumber, email, age);
        walletSystem.addAccount(account);
        System.out.println(" (: Account created successfully! :)");
        System.out.println(" ;) Welcome , " + name);
    }

    // Login
    @Override
    public Account login(String userName, String password) {

        // Check If UserName Exists
        Account account = walletSystem.findByUserName(userName);
        if (account == null) {
            throw new AccountException(" User not Found : " + userName);
        }

        // Check Password
        if (!account.getPassword().equals(password)) {
            throw new AccountException(" Wrong password!");
        }

        System.out.println(" Login successful! ");
        System.out.println(" Welcome back , " + account.getName());
        return account;
    }

    // Change Account Password
    @Override
    public void changePassword(Account account, String oldPassword, String newPassword) {

        // Check Old Password
        if (!account.getPassword().equals(oldPassword)) {
            throw new AccountException(" - Old Password is Incorrect! ");
        }

        // Use Same Password
        if (oldPassword.equals(newPassword)) {
            throw new AccountException(" - New password must be different from old password! ");
        }

        // Update Password
        account.setPassword(newPassword);
        System.out.println(" - Password Changed Successfully!");
    }
}