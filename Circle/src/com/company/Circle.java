package com.company;

public class Circle {
    private  double radius;
    private  String colour;
    private  static int numOfCircles;

    Circle() {
        radius=3;
        colour="brown";
    }

    Circle(double radius, String colour){
        
        this.radius=radius;
        this.colour=colour;
        numOfCircles++;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public static int getNumOfCircles() {
        return numOfCircles;
    }

    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }
    public double getArea(){
        return radius*radius*3.14;
    }
}
