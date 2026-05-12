package com.upgradadedthanyesterday.java.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for(int i = 0; i<100; i++) {
            final int k = i;
            Future<Integer> future = executorService.submit(() -> {
                Thread.sleep(100);
                int val = k;
                System.out.println("I am Thread '" + Thread.currentThread().getName() + "' and here I am returning " + val);
                return val;
            });
            Integer result = future.get();
            System.out.println("I am Thread '" + Thread.currentThread().getName() + "' and I am printing result from future : " + result);
        }
        executorService.shutdown();
    }
}
