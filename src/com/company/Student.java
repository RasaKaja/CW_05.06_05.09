package com.company;

public class Student extends Person{
    // three fields: type of study, year of study, study price
    private String type;
    private int year;
    private double price;

    // three-arguments constructor: type of study, year of study, study price
    Student(String type, int year, double price){
        this.type = type;
        this.year = year;
        this.price = price;
    }

    // `getter` methods which will be responsible for returning declared fields
    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    // `setter` methods which will be responsible for setting declared fields
    public void setType(String type) {
        this.type = type;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // `toString` method which should return details information about a student
    @Override
    public String toString() {
        return "Student{" + "name = " + name +
                "type='" + type + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}