package com.upgradadedthanyesterday.java.util.stream.filter.problem6;

public class Employee {
    private String firstName;
    private String lastName;
    private Double salary;
    private String designation;

    public Employee(String firstName, String lastName, Double salary, String designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.designation = designation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                '}';
    }
}
