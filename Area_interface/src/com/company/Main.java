package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle c=new Circle(5);
        System.out.println(c.getPerimeter());
        System.out.println(c.toString());

        Rectangle r=new Rectangle(5,3);
        System.out.println(r.getPerimeter());
        System.out.println(r.toString());
    }
}
