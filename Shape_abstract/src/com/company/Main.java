package com.company;

public class Main {

    public static void main(String[] args) {

        Shape s3 = new Rectangle( "red", false,1.0, 2.0);   // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength());
    }
}
