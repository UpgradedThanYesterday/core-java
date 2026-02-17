package com.upgradadedthanyesterday.java.util.stream.filter.problem6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Problem statement can be found here. {@see - problem_statement.txt}
 */
public class FindEmployeesWithSalaryGreaterThan50000 {
    public static void main(String[] args) {
        // input list
        Employee e1 = new Employee("A","A",10000.00,"Associate");
        Employee e2 = new Employee("B","B",53000.00,"Sr. Associate");
        Employee e3 = new Employee("C","C",80000.00,"Manager");
        Employee e4 = new Employee("D","D",49000.00,"Associate");
        Employee e5 = new Employee("E","E",50001.00,"Tech. Lead");

        List<Employee> list = List.of(e1, e2, e3, e4, e5);

        // Applied filter abd then pipelined terminal operation to print the value
        list.stream().filter(e->e.getSalary()>50000).forEach(System.out::println);
    }
}
