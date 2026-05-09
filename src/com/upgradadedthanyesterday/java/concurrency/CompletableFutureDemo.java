package com.upgradadedthanyesterday.java.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("I am Thread : '" +Thread.currentThread().getName() + "' and I am executing CompletableFuture");
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("I am Thread '"+Thread.currentThread().getName()+"' and here I am returning "+10);
            return 10;
        });

        System.out.println("I am Thread '"+Thread.currentThread().getName() +"' and I am not blocked due to the execution of CompletableFuture");

//        Integer result = completableFuture.get();
//        System.out.println("I am Thread '"+Thread.currentThread().getName() +"' and I am printing result from completableFuture : "+result);

        completableFuture.thenApply(rs -> rs*2)
                .thenAccept(rs->
                    System.out.println("I am Thread '"+Thread.currentThread().getName() +"' and I am printing modified result from completableFuture : "+rs)
                );

        System.out.println("I am Thread '"+Thread.currentThread().getName() +"' and I am printing result from completableFuture : "+11);
    }
}
