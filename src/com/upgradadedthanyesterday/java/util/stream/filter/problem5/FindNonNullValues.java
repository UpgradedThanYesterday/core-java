package com.upgradadedthanyesterday.java.util.stream.filter.problem5;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Problem statement can be found here. {@see - problem_statement.txt}
 */
public class FindNonNullValues {
    public static void main(String[] args) {
        // input list
        List<String> list = Arrays.asList("A","AA","AABBB",null,"ABCD",null);

        // Applied filter abd then pipelined terminal operation to print the value
        list.stream().filter(Objects::nonNull).forEach(System.out::println);
    }
}
