package com.company;

public class Circle {
    private double radius=1.0;
    private String colour="red";

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getArea(){
        return 3.14*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                '}';
    }
}
