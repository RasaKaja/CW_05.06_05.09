package com.company;

public class Rectangle extends Shape {
    double width, length;

    //non-arguments constructor
    Rectangle(){
        super();
        this.width = 1d;
        this.length = 1d;
    }

    //four-arguments constructor
    Rectangle(String color, boolean isFilled, double width, double length){
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    // `getter` methods which will be responsible for returning the `width` and `length` value
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // `setter` methods which will be responsible for setting the `width` and `length` value
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // `getArea` method which will be responsible for calculating the surface area
    public double getArea(){
        double area = length * width;
        return area;
    }

    //`getPerimeter` method which will be responsible for calculating the circuit
    public double getPerimeter(){
        double circuit = 2 * (width + length);
        return circuit;
    }

    // `toString` method which should return the following information:
    // `Rectangle with width=? and length=? which is a subclass off y`,
    // where ? is a placeholder for the width and length value accordingly
    // and the `y` info should be a result of the `toString` execution from the base class
    @Override
    public String toString() {
        return "Rectangle with width = " + width + " and length = " + length + " which is a subclass off " + super.toString();
    }
}
