package com.upgradadedthanyesterday.java.concurrency.deadlock;

public class DeadlockDemo {
    private static final Object LOCK_1 = new Object();
    private static final Object LOCK_2 = new Object();
    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            System.out.println("I am "+Thread.currentThread().getName()+" going inside synchronized block");
            synchronized (LOCK_1) {
                System.out.println("I am "+Thread.currentThread().getName()+" holding the LOCK_1");
                try{
                    System.out.println(Thread.currentThread().getName()+" is sleeping for 100 ms");
                    Thread.sleep(100); // holding LOCK_1 and sleeping for 100ms so by that time, LOCK_2 will be acquired by t2
                } catch (InterruptedException e) {
                    System.out.println("Exception "+e);
                }

                synchronized(LOCK_2) {
                    System.out.println("I am "+Thread.currentThread().getName()+" holding the LOCK_2");
                }
            }
        });

        Thread t2 = new Thread(()->{
            System.out.println("I am "+Thread.currentThread().getName()+" getting inside synchronized block");
            synchronized(LOCK_2) {
                System.out.println("I am "+Thread.currentThread().getName()+" holding the LOCK_2");
                try {
                    System.out.println(Thread.currentThread().getName()+" is sleeping for 100 ms");
                    Thread.sleep(100); // holding the LOCK_2 and sleeping for 100ms so by that time, LOCK_1 will be acquired by t1
                } catch (InterruptedException e) {
                    System.out.println("Exception " + e);
                }
                synchronized(LOCK_1) {
                    System.out.println("I am "+Thread.currentThread().getName()+" holding the LOCK_1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
