package com.java;

public class Bill {
    // Bill > total price / same ID as Order

    private int idBill;
    private double totalPriceBill;

    public int getIdBill() {
        return idBill;
    }

    public void setIdBill(int idBill) {
        if (idBill > 0) {
            this.idBill = idBill;
        } else {
            System.out.println("Invalid ID.");
        }
    }

    public double getTotalPriceBill() {
        return totalPriceBill;
    }

    public void setTotalPriceBill(double totalPriceBill) {
        if (totalPriceBill > 0) {
            this.totalPriceBill = totalPriceBill;
        } else {
            System.out.println("Invalid Total Price.");
        }
    }
}