package com.upgradadedthanyesterday.java.concurrency.producerconsumer;

/**
 * Consumer consume values from shared buffer
 */
public class Consumer extends Thread {
    private final SharedBuffer sharedBuffer;

    public Consumer (SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    public void run() {
        try {
            while (true) {
                this.consume();
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void consume() throws InterruptedException {
        this.sharedBuffer.removeData();
    }
}
