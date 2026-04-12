package com.java;

public class Main {
    public static void main(String[] args) {

        BankAcc account = new BankAcc(1000);

        account.deposit(500);
        account.withdraw(300);

        account.deposit(-50);
        account.withdraw(2000);

        System.out.println("Final Balance: " + account.getBalance());
    }
}