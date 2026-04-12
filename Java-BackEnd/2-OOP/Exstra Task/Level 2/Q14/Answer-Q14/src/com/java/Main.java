package com.java;

public class Main {
    public static void main(String[] args) {

        BankAcc account = new BankAcc (1000);

        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(500);
        System.out.println("After deposit: " + account.getBalance());

        account.withdraw(300);
        System.out.println("After withdraw: " + account.getBalance());

        account.deposit(-50);
        account.withdraw(2000);

        System.out.println("Final Balance: " + account.getBalance());
    }
}