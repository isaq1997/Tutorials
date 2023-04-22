package com.company;

public class Account {
    private short id;
    private String fullName;
    private double balance;

    public Account(short id, String fullName, double balance) {
        this.id = id;
        this.fullName = fullName;
        this.balance = balance;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getBalance() {
        return balance;
    }

    /*public void setBalance(Double balance) {
        this.balance = balance;
    }*/

    public void debit (double amount){
        balance=balance-amount;
    }
    public void credit (double amount){
        balance=balance+amount;
    }
    public void transferTo(Account acc,double amount){
       acc.credit(amount);
       debit(amount);
    }
}
