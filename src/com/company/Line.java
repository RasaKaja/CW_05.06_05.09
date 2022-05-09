package com.company;

public class Line {
    Point2D start, end;

    Line(Point2D beginPoint, Point2D endPoint){
        this.start = beginPoint;
        this.end = endPoint;
    }

    Line(float beginPointX, float beginPointY, float endPointX, float endPointY){
        this.start = new Point2D(beginPointX, beginPointY);
        this.end = new Point2D(endPointX, endPointY);
    }

    public Point2D getStart() {
        return start;
    }

    public Point2D getEnd() {
        return end;
    }

    public void setStart(Point2D start) {
        this.start = start;
    }

    public void setEnd(Point2D end) {
        this.end = end;
    }

    public double getLength(){
        //subtract the x and y coordinates of both points
        double x = start.getX() - end.getY();
        double y = start.getY() - end.getY();

        //square the result of the subtraction
        x = x * x;
        y = y * y;

        //add the x and y coordinates
        double sum = x + y;

        //distance = square root of addition
        double distance = Math.sqrt(sum);
        return distance;
    }

    public Point2D getCenter(){
        // add x coordinates and divide by 2
        float x = (start.getX() + end.getX()) /2;

        // add y coordinates and divide by 2
        float y = (start.getY() + end.getY()) /2;

        return new Point2D(x, y);
    }
}
