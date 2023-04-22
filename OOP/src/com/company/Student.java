package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
    private int id;
   private String name;
   private String surname;
   private int age;

    public Student(int id,String name,String surname,int age){
     this.id=id;
     this.name=name;
     this.surname=surname;
     this.age=age;
 }

    public static  void main (String[] args){
     Student s1= new Student(1,"Josh","Crowd",22);
        System.out.println(s1.age);

        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("3");
        BigDecimal c = a.divide(b, 20, RoundingMode.HALF_UP);
        System.out.println(c);

    }
}
