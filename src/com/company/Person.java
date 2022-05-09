package com.company;

public class Person {
    String name;
    String address;

    // non-arguments constructor which will set `name`, `address` fields as empty strings
    Person(){
        this.name = "";
        this.address = "";
    }

    // two-arguments constructor: `String name`, `String address`
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    // `getter` methods which will be responsible for returning `name`, `address` fields values
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // `setter` methods which will be responsible for setting `name`, `address` fields values
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // `toString` method which should return string in the following format: `?->?`, where `?` is the name and adress value accordingly//
    //Person{name= ?, address= ?}
    @Override
    public String toString() {
        return "name -> " + name + ", address -> " + address;
    }
}
