package org.example;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollectionExample {
    public static void main(String[] args) {
        // Create a list to hold objects
        List<Object> objectList = new ArrayList<>();

        // Run a loop to simulate object creation and usage
        for (int i = 0; i < 100000; i++) {
            Object obj = new Object();
            objectList.add(obj);

            // Introduce occasional null assignments to simulate objects becoming unreachable
            if (i % 100 == 0) {
                objectList.set(i / 2, null);
            }
        }

        // Trigger garbage collection to reclaim unused memory
        System.gc();
    }

    /**
     * To see logs
     * java -XX:+PrintGCDetails GarbageCollectionExample
     */
}
