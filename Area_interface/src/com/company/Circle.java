package com.company;

public class Circle implements GeometricObject {
    private  double radius=0.0;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getPerimeter(){
        return 6*radius;
    }
    public double getArea(){
        return 6*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
