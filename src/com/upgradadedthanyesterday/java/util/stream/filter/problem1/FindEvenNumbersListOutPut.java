package com.upgradadedthanyesterday.java.util.stream.filter.problem1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Problem statement can be found here. {@see - problem_statement.txt}
 */
public class FindEvenNumbersListOutPut {
    public static void main(String[] args) {
        // input array
        Integer[] arr = {1,2,3,4,3,6,5,7,9,8};

        // Since it's a Integer array, so you can use Reference type Stream like - Stream<Integer>
        Stream<Integer> intStream = Arrays.stream(arr);
        List<Integer> op = intStream.filter(i->i%2==0).toList();

        // Output
        System.out.println("The input Array is : "+ Arrays.toString(arr));
        System.out.println("The output Array is : "+ op);
    }
}
