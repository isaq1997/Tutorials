package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account a1=new Account((short) 1,"Padd Nemeth", 2000);
        Account a2=new Account((short) 2,"Padd Lock", 2000);
        //a1.debit(40);
        //a1.credit(40);
        //System.out.println(a1.getBalance());
        a1.transferTo(a2,200);
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());


    }
}
