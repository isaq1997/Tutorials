package com.company;

public class Square extends Rectangle {
    public Square(){

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, Boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side){
        super.width=side;
    }

    public void setWidth(double side){
        super.width=side;
    }
    public void setLength(double side){
        super.length=side;
    }

    @Override
    public String toString() {
        return "Square{" +super.toString()+"}";
    }
}
