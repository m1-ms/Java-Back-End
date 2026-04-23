package model;

import java.util.ArrayList;
import java.util.List;

public class EWalletSystem {

    private final String name = " Storm Cash ";

    private List<Account> accounts = new ArrayList<>();

    public String getName() {
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    // Search by UserName
    public Account findByUserName(String userName){
        for (Account account : accounts){
            if (account.getUserName().equals(userName)){
                return account;
            }
        }
        return null;
    }
}