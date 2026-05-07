package com.upgradadedthanyesterday.java.lambda.variations;

public class TestNoParam {
    public static void main(String[] args) {
        NoParam noParam = ()-> System.out.println("No Param");
        noParam.print();
    }
}
