package com.upgradadedthanyesterday.java.util.stream.filter.problem8;

/**
 * The Employee class represents an employee in an organization.
 * It contains an id, name, salary, and a reference to the department the employee belongs to.
 */
public class Employee {
    private int id;
    private String name;
    private double salary;
    private String status;
    private Department department;

    public Employee(int id, String name, double salary, String status, Department department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.status = status;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getStatus() {
        return status;
    }

    public boolean isActive() {
        return "ACTIVE".equalsIgnoreCase(status);
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", status='" + getStatus() + '\'' +
                ", department=" + getDepartment() +
                '}';
    }
}
