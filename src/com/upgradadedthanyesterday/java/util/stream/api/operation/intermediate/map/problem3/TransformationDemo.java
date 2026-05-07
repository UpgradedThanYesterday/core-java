package com.upgradadedthanyesterday.java.util.stream.api.operation.intermediate.map.problem3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TransformationDemo {
    public static void main(String[] args) {
        List<String> names = List.of("alice", "bob", "charlie");

// map() → transforms each element, structure stays same
        List<String> upper = names.stream()
                .map(String::toUpperCase)       // each String → String
                .collect(Collectors.toList());

        System.out.println(upper);
// [ALICE, BOB, CHARLIE]


// flatMap() → each element becomes a stream, all merged
        List<String> chars = names.stream()
                .flatMap(name -> Arrays.stream(name.split("")).map(String::toUpperCase))  // each String → Stream<String>
                .collect(Collectors.toList());

        System.out.println(chars);
// [a, l, i, c, e, b, o, b, c, h, a, r, l, i, e]

        for (String s : names) {
            String[] arr = s.split("");
        }
    }
}
