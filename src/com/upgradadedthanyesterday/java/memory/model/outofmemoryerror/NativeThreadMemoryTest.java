package com.upgradadedthanyesterday.java.memory.model.outofmemoryerror;

/**
 * Program to generate java.lang.OutOfMemoryError: unable to create native thread
 * Why this happens
 *  - This happens when too many threads are created and each thread is consuming resources.
 * In our water bucket Analogy
 *      -   Heap = bucket for objects
 *      -   Threads = people entering a room so that they can put more water to the bucket
 *      -   Room has limited capacity
 *      -   Keep adding people →  no space → crash
 */
public class NativeThreadMemoryTest {
    public static void main(String[] args) {
        while (true) {
            new Thread(() -> {
                try {
                    // keep thread alive so it consumes resources
                    Thread.sleep(1000000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
