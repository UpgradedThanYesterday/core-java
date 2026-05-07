package com.upgradadedthanyesterday.java.util.stream.api.operation.intermediate.map.problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<String> input = List.of("apple", "banana", "avocado", "orange");
        List<String> result = new ArrayList<>(); // Not thread-safe

// Stream way
        input.parallelStream()
                .filter(x->x.startsWith("a"))
                .forEach(result::add);             // race condition as multiple thread can access result object- unpredictable output.

        System.out.println("Stream way : "+ result); // o/p - Stream way [“AVOCADO”, “APPLE”]

//        ForkJoinPool.commonPool();
//
//         int  sum = 0;
//// Stream way
//        input.parallelStream()
//                .filter(x->x.startsWith("a"))
//                .forEach(x->{
//                    System.out.println(sum++);
//                });              // compile time error. Variable used in lambda should be final or effectively final.
    }
}
