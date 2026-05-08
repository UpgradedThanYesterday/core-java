package com.upgradadedthanyesterday.java.concurrency;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        System.out.println("I am Thread : '" +Thread.currentThread().getName() + "' and I am executing executor service");

        Future<Integer> future = executorService.submit(() -> {
            Thread.sleep(100);
            System.out.println("I am Thread '"+Thread.currentThread().getName()+"' and here I am returning "+10);
            return 10;
        });

        System.out.println("I am Thread '"+Thread.currentThread().getName() +"' and I am not blocked due to the execution of Future");

        Integer result = future.get();
        System.out.println("I am Thread '"+Thread.currentThread().getName() +"' and I am printing result from future : "+result);

        executorService.shutdown();
    }
}
