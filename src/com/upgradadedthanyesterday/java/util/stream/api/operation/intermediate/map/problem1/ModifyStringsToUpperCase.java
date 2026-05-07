package com.upgradadedthanyesterday.java.util.stream.api.operation.intermediate.map.problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Problem statement can be found here. {@see - problem_statement.txt}
 */
public class ModifyStringsToUpperCase {
    public static void main(String[] args) {
        // input array
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i<=100; i++) {
            arr.add(i);
        }

//        List<Integer> op = arr.parallelStream()
//                .peek(x->System.out.println("before filter : "+x))
//                .filter(x->x%2==0).peek(x-> System.out.println("processing : "+x)).map(x->x*2).toList();
//
//        System.out.println("Stream way : "+op);

        Stream<Integer> stream = arr.stream().filter(x->x%2==0);
//        stream = stream.flatMap().limit(3);
        System.out.println(stream.toList());
    }
}
