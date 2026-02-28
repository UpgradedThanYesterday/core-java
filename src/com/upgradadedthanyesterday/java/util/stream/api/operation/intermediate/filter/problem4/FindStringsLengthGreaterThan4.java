package com.upgradadedthanyesterday.java.util.stream.api.operation.intermediate.filter.problem4;

import java.util.List;

/**
 * Problem statement can be found here. {@see - problem_statement.txt}
 */
public class FindStringsLengthGreaterThan4 {
    public static void main(String[] args) {
        // input list
        List<String> list = List.of("A","AA","AABBB","AAABB","ABCD","ABCDE");

        // Applied filter abd then pipelined terminal operation to print the value
        list.stream().filter(s->s.length()>4).forEach(System.out::println);
    }
}
