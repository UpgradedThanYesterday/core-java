package com.upgradadedthanyesterday.java.util.stream.filter.problem8;

import java.util.List;
import java.util.stream.Stream;

public class FindEmployeesWithHighSalary {
    public static void main(String[] args) {
        /**
         * Department
         * -----------
         * id	|	name        |
         * 1	|	Engineering |
         * 2	|	HR          |
         * 3	|	Sales       |
          */
        Department engineering = new Department(1, "Engineering");
        Department hr = new Department(2, "HR");
        Department sales = new Department(3, "Sales");

        /**
         * Employee
         * --------
         -----------
         id	|	name	        |	salary	    |	status      | Department_id |
         1	|	Alice Johnson	|	95000.00	|	ACTIVE      |   1           |
         2	|	Bob Martinez	|	72000.50	|	ACTIVE      |   1           |
         3	|	Carol Singh	    |	60000.00	|	ON_LEAVE    |   2           |
         4	|	David Lee	    |	45000.00	|	INACTIVE    |   1           |
         5	|	Eve Turner	    |	82000.75	|	ACTIVE      |   3           |
          */
        Employee alice = new Employee(1, "Alice Johnson", 95000.00, "ACTIVE", engineering);
        Employee bob = new Employee(2, "Bob Martinez", 72000.50, "ACTIVE", engineering);
        Employee charlie = new Employee(3, "Carol Singh", 60000.00, "ON_LEAVE", hr);
        Employee dave = new Employee(4, "David Lee", 45000.00, "INACTIVE", engineering);
        Employee eve = new Employee(5, "Eve Turner", 82000.75, "ACTIVE", sales);

        // Applied filter abd then pipelined terminal operation to print the value
        List<Employee> employees = List.of(alice, bob, charlie, dave, eve);
        employees.stream()
                .filter(e->e.getSalary()>70000)
                .filter(e->"Engineering".equals(e.getDepartment().getName()))
                .filter(Employee::isActive)
                .forEach(System.out::println);
    }
}
