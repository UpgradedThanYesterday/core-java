package com.upgradadedthanyesterday.java.lambda.variations;

public class TestMultilineBody {
    public static void main(String[] args) {
        MultilineBody multilineBody = (a,b) -> {
            int val = (a*a + 2*a*b + b*b);
            return val;
        };
        int squareOfASum = multilineBody.squareOfASum(5, 10);
        System.out.println("The square Of A Sum is : "+squareOfASum);
    }
}
