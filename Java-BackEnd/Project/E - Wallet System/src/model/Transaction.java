package model;

public class Transaction {

    private String type;
    private double amount;
    private double balanceAfter;
    private String details;

    public Transaction(String type, double amount, double balanceAfter, String details) {
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
        this.details = details;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalanceAfter() {
        return balanceAfter;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return " - [" + type + "] Amount : " + amount +
                "\n - Balance After : " + balanceAfter +
                "\n - Details : " + details +
                "\n  ـــــــــــــــــــــــــــــــــــــــــــــــــــــ ";
    }
}
