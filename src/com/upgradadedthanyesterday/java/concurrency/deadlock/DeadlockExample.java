package com.upgradadedthanyesterday.java.concurrency.deadlock;

public class DeadlockExample {
    private static final Object LOCK_1 = new Object();
    private static final Object LOCK_2 = new Object();
    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            synchronized (LOCK_1) {
                System.out.println("I am "+Thread.currentThread().getName()+" holding the LOCK_1");
                try{
                    System.out.println(Thread.currentThread().getName()+" is sleeping for 100 ms");
                    Thread.sleep(1); // holding LOCK_1 and sleeping for 100ms so by that time, LOCK_2 will be acquired by t2
                    System.out.println(Thread.currentThread().getName()+" woke up now");
                } catch (InterruptedException e) {
                    System.out.println("Exception "+e);
                }

                System.out.println(Thread.currentThread().getName()+" currently here to get the LOCK_2");
                synchronized(LOCK_2) {
                    System.out.println("I am "+Thread.currentThread().getName()+" holding the LOCK_2");
                }
            }
        });

        Thread t2 = new Thread(()->{
            synchronized(LOCK_2) {
                System.out.println("I am "+Thread.currentThread().getName()+" holding the LOCK_2");
                try {
                    System.out.println(Thread.currentThread().getName()+" is sleeping for 100 ms");
                    Thread.sleep(100); // holding the LOCK_2 and sleeping for 100ms so by that time, LOCK_1 will be acquired by t1
                    System.out.println(Thread.currentThread().getName()+" woke up now");
                } catch (InterruptedException e) {
                    System.out.println("Exception " + e);
                }

                System.out.println(Thread.currentThread().getName()+" currently here to get the LOCK_1");
                synchronized(LOCK_1) {
                    System.out.println("I am "+Thread.currentThread().getName()+" holding the LOCK_1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
