package com.upgradadedthanyesterday.java.miscellaneous;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {
    private AtomicInteger count = new AtomicInteger();

    public void increment() {
        count.incrementAndGet();
    }

    public void print() {
        System.out.println(Thread.currentThread().getName()+" -- "+count);
    }

    public static void main(String[] args) {
        AtomicTest test = new AtomicTest();

        new Thread(()->{
            test.increment();
            test.print();
        }).start();

        new Thread(()->{
            test.increment();
            test.print();
        }).start();

        new Thread(()->{
            test.increment();
            test.print();
        }).start();
    }
}
