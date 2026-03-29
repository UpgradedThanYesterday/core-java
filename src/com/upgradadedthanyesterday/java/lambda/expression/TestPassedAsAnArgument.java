package com.upgradadedthanyesterday.java.lambda.expression;

/**
 * Lambda Expression Passed as an Argument to a Method
 */
public class TestPassedAsAnArgument {
    public static void greet(Greeting g) {
        g.sayHello();
    }

    public static void main(String[] args) {
        greet(()->System.out.println("Hello Students"));
    }
}
