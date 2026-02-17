package com.upgradadedthanyesterday.java.util.stream.filter.problem3;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Problem statement can be found here. {@see - problem_statement.txt}
 */
public class FindStringsStartingWithA {
    public static void main(String[] args) {
        // input array
        String[] arr = {"Apple","Banana","Avocado"};

        // Used stream for further operations
        Stream<String> stream = Arrays.stream(arr);

        // Applied filter abd then pipelined terminal operation to print the value
        stream.filter(s->s.startsWith("A")).forEach(System.out::println);
    }
}
