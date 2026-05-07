package com.upgradadedthanyesterday.java.util.stream.api.operation.intermediate.map.problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Problem statement can be found here. {@see - problem_statement.txt}
 */
public class ModifyStringsToUpperCase {
    public static void main(String[] args) {
        // input array
        List<String> arr = List.of("apple", "banana", "avocado", "orange");

        // Traditional way
        List<String> result = new ArrayList<>();
        for (String string : arr) {
            if(string.startsWith("a"))
                result.add(string.toUpperCase());
        }
        System.out.println("Traditional way : "+result);


// Stream way
        Stream<String> op = arr.stream()
                .filter(x->x.startsWith("a"))
                .map(String::toUpperCase);

        System.out.println("output : "+ op.collect(Collectors.toList())); // o/p - for [“APPLE”, “AVOCADO”]

        System.out.println("Count : "+ op.count());




    }
}
