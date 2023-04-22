package com.company;

public class Account {
    private String number;
    private  double balance;
    private String name;
    private String mail;

    public Account() {
        this("388911129939393",10,"Irwintest","mzzz");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String name, String mail) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.mail = mail;
    }

    public void deposit(double deposit){
        this.balance+=deposit;
    }
    public void withdrawal(double withdrawal){
        if(balance-withdrawal<0) {
            System.out.println("Not enough money. Only "+balance+" avalaible");
        }
        else {
            this.balance-=withdrawal;
            System.out.println("Wihtdrawal processed "+balance+" remained");

        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
