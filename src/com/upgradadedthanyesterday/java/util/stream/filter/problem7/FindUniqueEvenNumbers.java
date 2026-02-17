package com.upgradadedthanyesterday.java.util.stream.filter.problem7;

import java.util.Arrays;
import java.util.List;

public class FindUniqueEvenNumbers {
    public static void main(String[] args) {
        // input list
        Integer[] arr = {1,2,3,2,3,2,1,5,6,6,4,5,8,7,9,9,0};
        List<Integer> list = Arrays.asList(arr);

        // Applied filter abd then pipelined terminal operation to print the value
        List<Integer> integerList = list.stream().filter(i->i%2==0).distinct().toList();
        System.out.println(integerList);
    }
}
