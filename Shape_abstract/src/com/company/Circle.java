package com.company;

public class Circle extends Shape{
    protected double radius=1.0;
    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return 3*Math.pow(radius,2);
    }
    public double getPerimeter(){
        return 6*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +super.toString()+
                "radius=" + radius +
                '}';
    }
}
