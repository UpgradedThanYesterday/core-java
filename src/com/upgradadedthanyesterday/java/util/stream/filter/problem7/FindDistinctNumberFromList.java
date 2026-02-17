package com.upgradadedthanyesterday.java.util.stream.filter.problem7;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Problem statement can be found here. {@see - problem_statement.txt}
 */
public class FindDistinctNumberFromList {
    public static void main(String[] args) {
        // input list
        Integer[] arr = {1,2,3,2,3,2,1,5,6,6,4,5,8,7,9,9,0};
        List<Integer> list = Arrays.asList(arr);

        // Applied filter abd then pipelined terminal operation to print the value
        List<Integer> integerList = list.stream().distinct().toList();
        System.out.println(integerList);
    }
}
