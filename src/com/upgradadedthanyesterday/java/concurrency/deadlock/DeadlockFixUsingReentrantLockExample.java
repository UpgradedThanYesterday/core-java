package com.upgradadedthanyesterday.java.concurrency.deadlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockFixUsingReentrantLockExample {
    public static final ReentrantLock LOCK_1 = new ReentrantLock();
    public static final ReentrantLock LOCK_2 = new ReentrantLock();
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                boolean tryLock1 = LOCK_1.tryLock(100L, TimeUnit.MILLISECONDS);
                if(tryLock1) {
                    System.out.println("I am "+Thread.currentThread().getName()+" holding the LOCK_1");
                    boolean tryLock2 = LOCK_2.tryLock(100L, TimeUnit.MILLISECONDS);
                    if(tryLock2) {
                        System.out.println("I am "+Thread.currentThread().getName()+" holding the LOCK_2");
                        LOCK_2.unlock();
                    }
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            } finally {
                LOCK_1.unlock();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                boolean tryLock2 = LOCK_2.tryLock(100L, TimeUnit.MILLISECONDS);
                if(tryLock2) {
                    System.out.println("I am "+Thread.currentThread().getName()+" holding the LOCK_2");
                    boolean tryLock1 = LOCK_1.tryLock(100L, TimeUnit.MILLISECONDS);
                    if(tryLock1) {
                        System.out.println("I am "+Thread.currentThread().getName()+" holding the LOCK_1");
                        LOCK_1.unlock();
                    }
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            } finally {
                LOCK_2.unlock();
            }
        });

        t1.start();
        t2.start();
    }
}
