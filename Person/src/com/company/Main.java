package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person p1=new Person("Hukk","Adelaide");
        Staff s1=new Staff(p1.getName(), p1.getAddress(), "106",2.2);
        Student st=new Student(p1.getName(), p1.getAddress(),"Math",2,2.3 );
        System.out.println(st);
        System.out.println(s1);

    }
}
