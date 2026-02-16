package com.upgradadedthanyesterday.java.util.stream.filter.problem1;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Problem statement can be found here. {@see - problem_statement.txt}
 */
public class FindOddNumbersArrayOutPut {
    public static void main(String[] args) {
        // input array
        int[] arr = {1,2,3,4,3,6,5,7,9,8};

        // Since it's a primitive array, so you can't use Stream<Integer>, instead of it use the Stream designed
        // for primitives like - IntStream
        IntStream intStream = Arrays.stream(arr);
        int[] op = intStream.filter(FindOddNumbersArrayOutPut::isOdd).toArray();

        // Output
        System.out.println("The input Array is : "+ Arrays.toString(arr));
        System.out.println("The output Array is : "+ Arrays.toString(op));
    }

    public static boolean isOdd(int i) {
        return i%2 != 0;
    }
}
