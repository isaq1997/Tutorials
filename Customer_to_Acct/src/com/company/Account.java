package com.company;

public class Account {
    private int ID;
    private Customer customer;
    private Double balance=0.0;

    public Account(int ID, Customer customer, Double balance) {
        this.ID = ID;
        this.customer = customer;
        this.balance = balance;
    }
    public Account(int ID, Customer customer) {
        this.ID = ID;
        this.customer = customer;
    }

    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public String getCustomerName() {

        return customer.getName();
    }

    @Override
    public String toString() {
        return "Account{" +
                "ID=" + ID +
                ", customer=" + customer +
                ", balance=" + balance +
                '}';
    }
}
