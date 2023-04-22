package com.company;

public class Circle extends Shape {
    private double radius=1.0;
    public Circle(){

    }
    public Circle( double radius){
        this.radius=radius;
    }
    public Circle( double radius,String colour,boolean filled){
        super(colour,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +super.toString()+
                ", radius=" + radius +
                '}';
    }
    public double getArea(){
        return 3*radius*radius;
    }
    public double getPerimeter(){
        return 6*radius;
    }
}
