package service;

import model.Account;
import model.EWalletSystem;
import exception.*;

public class AccountService {

    private EWalletSystem walletSystem;

    public AccountService(EWalletSystem wallet){
        this.walletSystem = wallet;
    }

    // Register
    public void register(String name , String userName , String password , String phoneNumber , String email , int age) {

        if (walletSystem.findByUserName(userName) != null){
            throw new AccountException(" UserName already exist : " + userName);
        }

        Account account = new Account(name, userName, password, phoneNumber, email, age);
        walletSystem.addAccount(account);
        System.out.println("Account created successfully! Welcome, " + name);
    }

    // Login
    public Account login(String userName, String password) {

        Account account = walletSystem.findByUserName(userName);

        if (account == null) {
            throw new AccountException("User not found: " + userName);
        }

        if (!account.getPassword().equals(password)) {
            throw new AccountException("Wrong password!");
        }

        System.out.println("Login successful! Welcome back, " + account.getName());
        return account;
    }
}
