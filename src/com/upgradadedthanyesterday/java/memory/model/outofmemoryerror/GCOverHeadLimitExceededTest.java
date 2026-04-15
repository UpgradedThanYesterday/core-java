package com.upgradadedthanyesterday.java.memory.model.outofmemoryerror;

import java.util.ArrayList;
import java.util.List;

/**
 * Program to generate java.lang.OutOfMemoryError: GC overhead limit exceeded.
 * to get the error, reduce the heap size
 *      - run with - java -Xms32m -Xmx32m -XX:+UseParallelGC GCOverHeadLimitExceededTest
 * When GC is working hard but not finding enough object to remove.
 */
public class GCOverHeadLimitExceededTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        int i = 0;
        while (true) {
            // Create many duplicate Strings (wastes memory slowly)
            list.add(String.valueOf(i).intern());

            // limit size slightly to avoid immediate heap crash
            if(list.size() > 100000) {
                list.remove(0); // slow memory churn
            }
            i++;
        }
    }
}
