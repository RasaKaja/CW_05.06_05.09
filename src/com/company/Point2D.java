package com.company;

public class Point2D {
    // two float fields : `x`, `y`
    private float x, y;

    // non-arguments constructor which will set `x`, `y` fields to `0`
    Point2D(){
        this.x = 0;
        this.y = 0;
    }
    //two-arguments constructor: `float x`, `float y`
    Point2D(float x, float y){
      this.x = x;
      this.y = y;
    }

    // `getter` methods which will be responsible for returning `x`, `y` fields values
    float getX(){
        return x;
    }

    float getY() {
        return y;
    }

    // `getXY` method which will return `x`, `y` values as two-element array
    public float[] getXY(){
        return new float[]{x, y};
    }

    //`setter` methods which will be responsible for setting `x`, `y` fields values
    public void setX(float x){
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    // `setXY` method which will be responsible for setting `x` and `y`
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    //`toString` method which should return string in the following format: `(x, y)`
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}