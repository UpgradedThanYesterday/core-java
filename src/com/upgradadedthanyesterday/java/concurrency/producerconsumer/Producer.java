package com.upgradadedthanyesterday.java.concurrency.producerconsumer;

/**
 * Producer produces values to the shared buffer
 */
public class Producer extends Thread {
    private final SharedBuffer sharedBuffer;

    public Producer (SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        int value = 0;
        try {
            while (true) {
                this.produce(value);
                value++;
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void produce(int value) throws InterruptedException {
        this.sharedBuffer.addData(value);
    }
}
