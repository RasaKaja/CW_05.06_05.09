package com.company;

public class Lecturer extends Person{
    // two fields: specialization, salary
    String specialization;
    int salary;

    // two-arguments constructor: specialization, salary
    Lecturer(String specialization, int salary){
        this.specialization = specialization;
        this.salary = salary;
    }

    // `getter` methods which will be responsible for returning declared fields
    public String getSpecialization() {
        return specialization;
    }

    public int getSalary() {
        return salary;
    }

    // `setter` methods which will be responsible for setting declared fields
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // `toString` method which should return details information about a lecturer
    @Override
    public String toString() {
        return "Lecturer{" + "name = " + name +
                ", specialization='" + specialization + '\'' +
                ", salary=" + salary +
                '}';
    }
}

//Please provide an example usage of above implementation.