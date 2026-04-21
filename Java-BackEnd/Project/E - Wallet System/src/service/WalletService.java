package service;

import exception.InvalidBalanceException;
import model.Account;
import model.EWalletSystem;

import exception.*;

public class WalletService {

    private EWalletSystem walletSystem;

    public WalletService(EWalletSystem walletSystem) {
        this.walletSystem = walletSystem;
    }

    // Deposit
    public void deposit(String userName, double amount) {
        Account account = walletSystem.findByUserName(userName);

        if (account == null) {
            throw new AccountException(" User not Found : " + userName);
        }
        if (amount <= 0) {
            throw new AccountException(" Amount must be greater than 0.");
        }

        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposit successful! New Balance : " + account.getBalance());

    }

    // Withdraw
    public void withdraw(String userName, double amount) {

        Account account = walletSystem.findByUserName(userName);

        if (account == null) {
            throw new AccountException("User not Found : " + userName);
        }

        if (amount <= 0) {
            throw new AccountException("Amount must be greater than 0.");
        }

        if (account.getBalance() < amount) {
            throw new InvalidBalanceException(account.getBalance());
        }

        account.setBalance(account.getBalance() - amount);
        System.out.println("Withdraw successful! New Balance : " + account.getBalance());
    }

    // Transfer
    public void transfer(String fromUserName, String toUserName, double amount) {

        if (fromUserName.equals(toUserName)) {
            throw new AccountException("Cannot transfer to yourself!");
        }

        Account from = walletSystem.findByUserName(fromUserName);
        Account to = walletSystem.findByUserName(toUserName);

        if (from == null) {
            throw new AccountException("Sender not Found : " + fromUserName);
        }

        if (to == null) {
            throw new AccountException("Receiver not Found : " + toUserName);
        }

        if (amount <= 0) {
            throw new AccountException("Amount must be greater than 0.");
        }

        if (from.getBalance() < amount) {
            throw new InvalidBalanceException(from.getBalance());
        }

        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);

        System.out.println("Transfer successful!");
        System.out.println(fromUserName + " new Balance : " + from.getBalance());
        System.out.println(toUserName + " new Balance : " + to.getBalance());
    }
}
