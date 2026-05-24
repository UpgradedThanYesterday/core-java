package com.upgradadedthanyesterday.java.concurrency.thread;

public class ThreadStateDemo {

    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread(() -> {
            try {
                System.out.println("In Running state");
                Thread.sleep(2000);
                System.out.println("Back to Running state");

                synchronized (ThreadStateDemo.class) {
                    ThreadStateDemo.class.wait(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        System.out.println("Expected state : NEW and Actual state : "+thread.getState()); // New State

        thread.start();
        System.out.println("Expected state : RUNNABLE and Actual state : "+thread.getState()); // Runnable State

        Thread.sleep(500);
        System.out.println("Expected state : TIMED_WAITING and Actual state : "+thread.getState()); // TIMED_WAITING State

        thread.join();
        System.out.println("Expected state : TERMINATED and Actual state : "+thread.getState()); // TERMINATED
    }
}
