package com.upgradadedthanyesterday.java.core;

public class AutoBoxingTest {
    void print(int i) {
        System.out.println("int : "+i);
    }

    void print(Integer i) {
        System.out.println("Integer : "+i);
    }

    void print(long i) {
        System.out.println("long : "+i);
    }

    public static void main(String[] args) {
        AutoBoxingTest obj = new AutoBoxingTest();

        obj.print(Integer.valueOf(5));

        Integer a = 1000;
        long b = 1000;
        System.out.println(a.equals(b));
        System.out.println(a == b);

        int x = new Integer(10);
        System.out.println("x : "+x);
    }
}
