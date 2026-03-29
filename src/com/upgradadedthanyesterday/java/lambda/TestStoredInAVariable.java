package com.upgradadedthanyesterday.java.lambda;

/**
 * Lambda expression stored in a variable
 */
public class TestStoredInAVariable {
    public static void main(String[] args) {
        Greeting g = ()->System.out.println("Hello Students");
        g.sayHello();
    }
}
