package com.upgradadedthanyesterday.java.memory.model.outofmemoryerror;

import java.util.ArrayList;
import java.util.List;

/**
 * Program to generate java.lang.OutOfMemoryError: Java heap space
 * To generate this error, putting byte array objects to a list.
 * Since the list object i.e. new ArrayList object will be active so none of the byte array object will be eligible for
 * Garbage collection and hence the Heap Area will become full and throw OutOfMemoryError
 */
public class HeapSpaceTest {
    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();
        while (true) {
            // Allocate 1MB in each iteration
            byte[] data = new byte[1024*1024];
            list.add(data);
        }
    }
}
