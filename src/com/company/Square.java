package com.company;

public class Square extends Rectangle {
 //It should not add any new field or feature, but it should force square behaviour on the base class methods.

    Square(){
        super();
    }

    Square(double length, String color, boolean isFilled){
        super(color, isFilled, length, length);
    }

    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public String toString() {
        return "Square width=" + width + " ,and length=" + length + " which is a subclass of " + super.toString();
    }
}
