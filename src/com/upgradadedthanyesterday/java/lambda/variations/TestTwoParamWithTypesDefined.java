package com.upgradadedthanyesterday.java.lambda.variations;

public class TestTwoParamWithTypesDefined {
    public static void main(String[] args) {
        TwoParam twoParam = (int a, int b) -> 10+a+b;
        System.out.println(twoParam.add(10, 20));
    }
}
