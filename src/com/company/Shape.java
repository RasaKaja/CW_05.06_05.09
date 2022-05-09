package com.company;

public abstract class Shape {
    protected String color; //color information
    protected boolean isFilled; //information if color should fill a shape

    //non-arguments constructor which will set: the `color` field to `unknown` and the `isFilled` field to `false`
    Shape(){
        this.color = "unknown";
        this.isFilled = false;
    }

    // two-arguments constructor: `color`, `isFilled`
    Shape(String color, boolean isFilled){
        this.color = color;
        this.isFilled = isFilled;
    }

    // `getter` methods which will be responsible for returning declared fields
    public String getColor() {
        return color;
    }

    public boolean getIsFilled() {
        return isFilled;
    }

    // abstract methods are without body
    public abstract double getArea();
    public abstract double getPerimeter();

    // `setter` methods which will be responsible for setting declared fields
    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    String getFilled(){
        if (isFilled){
            return "filled";
        } else {
            return "not filled";
        }
    }

    //*  `toString` method which should return the following information:
    //`Shape with color of ? and filled/NotFilled`,
    // where ? is a placeholder for the color and the `filled`/`not filled` info should be returned depending on the `isFilled` field
    @Override
    public String toString() {
        return "Shape with color of " + color + " and " + getFilled();
    }
}
