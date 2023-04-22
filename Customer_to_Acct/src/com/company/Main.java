package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer c1=new Customer(1,"Matthew",'M');
        Customer c2=new Customer(2,"Steven",'M');
        Account a1=new Account(1,c2,200.0);
        System.out.println(a1.getCustomerName());
        System.out.println(a1.getCustomer());
    }
}
