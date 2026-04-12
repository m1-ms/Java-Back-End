package com.java;

public class Main {
    public static void main(String[] args) {

        BankAcc account = new BankAcc(1000);

        account.deposit(500);
        account.withdraw(200);

        System.out.println("Balance: " + account.getBalance());

        // account.balance = 10000;
    }
}