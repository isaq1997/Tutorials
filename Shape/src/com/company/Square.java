package com.company;

public class Square extends  Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(String colour, boolean filled, double side) {
        super(colour, filled, side,side);
    }

    public double getSide() {
        return super.getLength();
    }
    public void setSide(double side){
        super.setLength(side);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }
    public double getArea(){
        return super.getArea();
    }
    public double getPerimeter(){
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return "Square{"+super.toString()+"}";
    }
}
