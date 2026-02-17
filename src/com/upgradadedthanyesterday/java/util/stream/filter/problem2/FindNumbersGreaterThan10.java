package com.upgradadedthanyesterday.java.util.stream.filter.problem2;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Problem statement can be found here. {@see - problem_statement.txt}
 */
public class FindNumbersGreaterThan10 {
    public static void main(String[] args) {
        // input array
        Integer[] arr = {11,2,3,14,3,6,5,17,9,18};

        // Since it's a Integer array, so you can use Reference type Stream like - Stream<Integer>
        Stream<Integer> integerStream = Arrays.stream(arr);

        // Applied filter abd then pipelined terminal operation to print the value
        integerStream.filter(i->i>10).forEach(System.out::println);
    }
}
