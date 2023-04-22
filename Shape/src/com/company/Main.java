package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Square sq=new Square(5);
        Rectangle rec=new Rectangle(3,4);
        System.out.println(sq.getPerimeter());
        System.out.println(sq.getArea());
        System.out.println(sq.toString());
        System.out.println(rec.getArea());
        System.out.println(rec.getPerimeter());
        System.out.println(rec.toString());
    }
}
