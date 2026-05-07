package com.upgradadedthanyesterday.java.miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList {
    public static void main(String[] args) {
        String[] arr = {"A","B","C"};
        List<String> list = Arrays.asList(arr);
        System.out.println("1 " + list);

        List<String> uList = Collections.unmodifiableList(list);

        System.out.println("2 " + uList);

        List<String> vList = new ArrayList<>(uList);
        vList.add("D");

        System.out.println("3 " + vList);

    }
}
