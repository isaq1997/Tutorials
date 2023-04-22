package com.company;

public class Main {

    public static void main(String[] args) {
	Circle c=new Circle(3,"yellow");
    Cylinder cy=new Cylinder(c,2);
        System.out.println(cy.getArea());
        System.out.println(c.getArea());
        System.out.println(c.toString());
        System.out.println(cy.toString());
    }
}
