package service;

import model.Account;
import model.EWalletSystem;
import exception.*;

public class AccountService {

    private EWalletSystem walletSystemall;

    public AccountService(EWalletSystem wallet){
        this.walletSystemall = wallet;
    }

    // Register
    public void register(String name , String userName , String password , String phoneNumber , String email , int age) {

        if (walletSystemall.findByUserName(userName) != null){
            throw new AccountException(" UserName already exist : " + userName);
        }

        Account account = new Account(name, userName, password, phoneNumber, email, age);
        walletSystemall.addAccount(account);
        System.out.println("Account created successfully! Welcome, " + name);
    }

    // Login
    public Account login(String userName, String password) {

        Account account = walletSystemall.findByUserName(userName);

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
