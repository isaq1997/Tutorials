package com.company;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Customer c1=new Customer("Okk",true,"l");
        Visit v=new Visit(c1.getName(), Calendar.MONTH);
        c1.setMember(false);
        System.out.println(c1.getName());
       // System.out.println(c1.isMember());
       // System.out.println(v.getProductExpense());

    }
}
