package com.upgradadedthanyesterday.java.lambda.expression;

/**
 * Lambda Expression Returned from a Method
 */
public class TestReturnedFromAMethod {
    public static Greeting getGreeting() {
        return () -> System.out.println("Hello Students");
    }

    public static void main(String[] args) {
        Greeting g = getGreeting();
        g.sayHello();
    }
}
