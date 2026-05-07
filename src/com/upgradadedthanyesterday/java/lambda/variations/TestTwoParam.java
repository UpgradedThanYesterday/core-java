package com.upgradadedthanyesterday.java.lambda.variations;

public class TestTwoParam {
    public static void main(String[] args) {
        TwoParam twoParam = (a, b) -> a + b;
        System.out.println(twoParam.add(10,15));
    }
}
