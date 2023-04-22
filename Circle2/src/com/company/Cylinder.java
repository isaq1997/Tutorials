package com.company;

public class Cylinder extends  Circle {
    private double height=1.0;

    public Cylinder() {

    }

    public Cylinder(double height,double radius) {
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius) {
        super(radius);

    }
    public Cylinder(double height,double radius,String colour) {
        super(radius,colour);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "as subclass 0f "+super.toString()+" "+
                "height=" + height +
                '}';
    }
}
