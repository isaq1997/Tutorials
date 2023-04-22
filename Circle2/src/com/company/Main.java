package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle c1=new Circle(4.3);
        System.out.println(c1.getArea());
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println(c3.getVolume());
        System.out.println(c3.toString() );
    }
}
