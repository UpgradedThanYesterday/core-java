package com.upgradadedthanyesterday.java.util.stream.filter.problem8;

/**
 * The Department class represents a department within an organization.
 * It contains an id and a name for the department.
 */
public class Department {
    private int id;
    private String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                '}';
    }
}
