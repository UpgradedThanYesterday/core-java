package com.upgradadedthanyesterday.java.util.stream.count;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class MainCount {
    public static void main(String[] args) {
        Integer[] myArray = {1,2,3,4,5,6};
        Stream<Integer> myStream = Arrays.stream(myArray);
        System.out.println(myStream);

        long count = myStream.count();
        System.out.println("Total number of elements are : "+count);


        // For primitive types, Stream<Integer> can't be used also there is no Stream<int> is provided.
        // For each primitive types corresponding Streams are provided as follows
        int[] intArray = {1,2,3,4,5,6};
        IntStream intStream = Arrays.stream(intArray);
        System.out.println(intStream);

        long count1 = intStream.count();
        System.out.println("Total number of elements in intArray are : "+count);

        long[] longArray = {1,2,3,4,5,6};
        LongStream longStream = Arrays.stream(longArray);
        System.out.println(longStream);

    }
}