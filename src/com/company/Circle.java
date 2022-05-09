package com.company;

public class Circle extends Shape {
    float radius;

    //non-arguments constructor which will set: the `color` field value to `unknown`,
    // the `isFilled` field value to `false` and the `radius` field value to `1`
    Circle(){
        super(); // calls the method from the Shape class
        this.radius = 1f;
    }

    // three-arguments constructor: `color`, `isFilled`, `radius`
    Circle(String color, boolean isFilled, float radius){
        super(color, isFilled);
        this.radius = radius;
//        this.setColor(color); // it could be used instead of super (), but better super()
//        this.setFilled(isFilled);
    }

    // `getter` methods which will be responsible for returning the `radius` value
    public float getRadius() {
        return radius;
    }

    // `setter` methods which will be responsible for setting the `radius` value
    public void setRadius(float radius) {
        this.radius = radius;
    }

    // `getArea` method which will be responsible for calculating the surface area
    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }

    // `getPerimeter` method which will be responsible for calculating the circuit
    public double getPerimeter(){
        double circuit = 2 * Math.PI * radius;
        return circuit;
    }

    //* `toString` method which should return the following information:
    // `Circle with radius=? which is a subclass off y`, where ? is a placeholder for the radius value
    // and the `y` info should be a result of the `toString` execution from the base class
    @Override
    public String toString() {
        return "Circle with radius = " + radius + " which is subclass off " + super.toString();
    }


}

