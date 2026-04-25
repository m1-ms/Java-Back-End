package service.impl;

import exception.*;
import model.Account;
import model.EWalletSystem;
import model.Transaction;
import service.WalletService;

public class WalletServiceImpl implements WalletService {

    private final EWalletSystem walletSystem;

    public WalletServiceImpl(EWalletSystem walletSystem) {
        this.walletSystem = walletSystem;
    }

    // Deposit
    @Override
    public void deposit(String userName, double amount) {

        // Check if Account exist
        Account account = walletSystem.findByUserName(userName);
        if (account == null) {
            throw new AccountException(" User not Found : " + userName);
        }

        // Check Balance
        if (amount <= 0) {
            throw new AccountException(" Invalid Amount - [ Balance must be bigger than 0. ] ");
        }

        // Update
        account.setBalance(account.getBalance() + amount);
        // Save Transaction
        account.addTransaction(new Transaction(
                "Deposit",
                amount,
                account.getBalance(),
                "Deposit to " + userName
        ));
        System.out.println(" Deposit successful! New Balance : " + account.getBalance());
    }



    // Withdraw
    @Override
    public void withdraw(String userName, double amount) {

        // Check if Account exist
        Account account = walletSystem.findByUserName(userName);
        if (account == null) {
            throw new AccountException(" User not Found : " + userName);
        }

        // Check Balance
        if (amount <= 0) {
            throw new AccountException(" Invalid Amount - [ Balance must be bigger than 0. ] ");
        }

        if (account.getBalance() < amount) {
            throw new InvalidBalanceException(account.getBalance());
        }

        // Update
        account.setBalance(account.getBalance() - amount);
        // Save Transaction
        account.addTransaction(new Transaction(
                "Withdraw",
                amount,
                account.getBalance(),
                "Withdraw from " + userName
        ));
        System.out.println(" Withdraw successful! New Balance : " + account.getBalance());
    }

    // Transfer
    @Override
    public void transfer(String fromUserName, String toUserName, double amount) {

        // No Transfer yourself
        if (fromUserName.equals(toUserName)) {
            throw new AccountException(" Can't Transfer to yourself!");
        }

        // Check Account yourself
        // UserName from and to
        Account from = walletSystem.findByUserName(fromUserName);
        Account to = walletSystem.findByUserName(toUserName);

        if (from == null) {
            throw new AccountException(" - Sender not Found : " + fromUserName);
        }

        if (to == null) {
            throw new AccountException(" - Receiver not Found : " + toUserName);
        }

        if (amount <= 0) {
            throw new AccountException(" Invalid Amount - [ Balance must be bigger than 0. ] ");
        }

        if (from.getBalance() < amount) {
            throw new InvalidBalanceException(from.getBalance());
        }

        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);

        // Save Transaction - Sender
        from.addTransaction(new Transaction(
                "Transfer Out",
                amount,
                from.getBalance(),
                "Transfer to " + toUserName
        ));

        // Save Transaction - Receiver
        to.addTransaction(new Transaction(
                "Transfer In",
                amount,
                to.getBalance(),
                "Transfer from " + fromUserName
        ));

        System.out.println(" Transfer successful!");
        System.out.println(fromUserName + " new Balance : " + from.getBalance());
        System.out.println(toUserName + " new Balance : " + to.getBalance());
    }
}