package com.upgradadedthanyesterday.java.concurrency.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Shared buffer is a Class holding a Queue.
 */
public class SharedBuffer {
    private final int capacity;
    private final Queue<Integer> buffer = new LinkedList<>();

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Adding a value to the Queue
     */
    public synchronized void addData(int value) throws InterruptedException {
        while (buffer.size() == capacity) {
            System.out.println("The buffer is full " + buffer);
            wait();
        }

        buffer.add(value);
        System.out.println(value + " is added to the buffer, current elements are " + buffer);
        notify();
    }

    /**
     * Removing a value from the queue
     */
    public synchronized void removeData() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("The buffer is empty, so waiting for data");
            wait();
        }

        int value = buffer.poll();
        System.out.println(value + " is added to the removed, current elements are " + buffer);
        notify();
    }
}
