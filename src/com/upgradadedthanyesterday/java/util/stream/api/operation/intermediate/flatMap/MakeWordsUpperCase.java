package com.upgradadedthanyesterday.java.util.stream.api.operation.intermediate.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MakeWordsUpperCase {

    public static void main(String[] args) {
        List<String> list = List.of("abc","def","ghi");

        List<String> op1 = list.stream().map(String::toUpperCase).toList();
        System.out.println(op1);

        List<String> op2 = list.stream().flatMap(x->Stream.of(x.toUpperCase())).peek(x-> System.out.println("here "+x)).toList();
        System.out.println(op2);


        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(Integer.valueOf(10));

        List<Long> list2 = new ArrayList<>();
        list2.add(100L);
        System.out.println(list2.contains(100));

        Integer x = null;
        int y = x;
        System.out.println(y);
    }
}
