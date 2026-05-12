package com.upgradadedthanyesterday.java.concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class MarkCompleteCompletableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("I am Thread '"+Thread.currentThread().getName()+"' and here I am returning "+10);
            return 10;
        });

        completableFuture.complete(10);
        System.out.println("I am Thread '"+Thread.currentThread().getName()+"' and here I am returning completableFuture "+completableFuture.get());
    }
}
