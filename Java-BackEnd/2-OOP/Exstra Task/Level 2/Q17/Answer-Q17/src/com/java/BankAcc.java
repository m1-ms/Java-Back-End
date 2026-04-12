package com.java;

public class BankAcc {

    private double balance;

    public BankAcc(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdraw amount");
        }
        else if (amount > balance) {
            System.out.println("Cannot withdraw more than available balance");
        }
        else {
            balance -= amount;
            System.out.println("Withdraw successful");
        }
    }
}