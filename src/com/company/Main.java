package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    // Point2D and Point3D
//        Point3D point = new Point3D(3,4,5);
//        System.out.println(Arrays.toString(point.getXYZ()));
//        System.out.println(point.getX());
//        System.out.println(point.getZ());

    // Person -> Student, Lecturer
//        Lecturer lecturer = new Lecturer("Data Analysis", 35000);
//        lecturer.setName("David");
//        lecturer.setAddress("6 test drive ave.");
//        System.out.println(lecturer);

//        Student student = new Student("Pirmakursis", 2022, 500);
//        System.out.println(student);
//        student.setName("David");
//        student.setAddress("6 Test Drive");
//
//        System.out.println(student);

    // shape -> circle, rectangle, square
//    Shape blueShape = new Shape("Blue", true);
//    Shape redShape = new Shape("Red", true);
//
//    Shape shape = new Shape();
//        System.out.println(redShape);
//        System.out.println(blueShape);
//        System.out.println(shape);

//        Circle circle = new Circle();
//        Circle bigCircle = new Circle("Red", true, 4f);
//
//        System.out.println(circle);
//        System.out.println(bigCircle);
//
//        System.out.println(circle.getArea());
//        System.out.println(bigCircle.getArea());
//
//        Rectangle rectangle = new Rectangle();
//        Rectangle rectangle1 = new Rectangle("Red", true, 23, 15);
//        Square square = new Square();
//
//        System.out.println(rectangle);
//        System.out.println(rectangle1);
//        System.out.println(square);

        Line line = new Line(0f, 0f, 5f, 5f);
        System.out.println(line.getLength());
        System.out.println(line.getCenter());



    }
}
