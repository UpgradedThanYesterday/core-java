package com.upgradadedthanyesterday.java.concurrency.producerconsumer;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedBuffer sharedBuffer = new SharedBuffer(5);
        Producer producer = new Producer(sharedBuffer);
        Consumer consumer = new Consumer(sharedBuffer);

        producer.start();
        consumer.start();
    }
}
