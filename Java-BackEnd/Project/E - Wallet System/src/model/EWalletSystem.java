package model;

import java.util.ArrayList;
import java.util.List;

public class EWalletSystem {

    private final String name = "Storm Cash";

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

    public void addAccount(Account account){
        accounts.add(account);
    }

    // Auto Account Admin User Data
    public EWalletSystem(){
        Account adminMain = new Account("Mahmoud Sliman","mahmoud_24","Mahmoud#@080","01026167100","mahmoud080@gmail.com",22,true);
        accounts.add(adminMain);
    }

    // Find Account By UserName
    public Account findByUserName(String userName){
        for (Account account : accounts){
            if (account.getUserName().equals(userName)){
                return account;
            }
        }
        return null;
    }

    // Find Account By PhoneNumber
    public Account findByPhone(String phoneNumber) {
        for (Account account : accounts) {
            if (account.getPhoneNumber().equals(phoneNumber)) {
                return account;
            }
        }
        return null;
    }

    // Find Account By Email
    public Account findByEmail(String email){
        for (Account account : accounts){
            if (account.getEmail().equals(email)){
                return account;
            }
        }
        return null;
    }

    // Delete Account   [ Remove = Delete ]
    public void deleteAccount(Account account){
        accounts.remove(account);
    }
}