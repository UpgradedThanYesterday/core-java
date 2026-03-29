package com.upgradadedthanyesterday.java.lambda.variations;

public class TestSingleParam {
    public static void main(String[] args) {
        SingleParam singleParam = (x)-> x*x;
        int val = singleParam.square(30);
        System.out.println(val);
    }
}
