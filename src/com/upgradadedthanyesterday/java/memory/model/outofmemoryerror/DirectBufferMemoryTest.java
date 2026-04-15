package com.upgradadedthanyesterday.java.memory.model.outofmemoryerror;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * Program to generate java.lang.OutOfMemoryError: direct buffer memory.
 * Why this happens
 *  - Direct buffers use native memory so GC does not immediately reclaim them.
 * In our water bucket Analogy
 *      -   Heap → water tank inside house
 *      -   Direct buffer → external storage tank
 *      -   You keep filling external tank → house doesn’t see it
 *      -   Suddenly → runs out of space
 */
public class DirectBufferMemoryTest {
    public static void main(String[] args) {
        List<ByteBuffer> list = new ArrayList<>();

        while (true) {
            // Allocate 1MB direct buffer
            ByteBuffer buffer = ByteBuffer.allocateDirect(1024 * 1024);
            list.add(buffer); // hold reference → no cleanup
        }
    }
}