package org.example;

import java.util.HashMap;
import java.util.Map;

public class ImmutableClassExample {
    /**
     * Private and final fields
     * No setter methods
     * Only getter methods
     * No Mutable Objects references
     * Immutable Reference Types: If your class has fields that are references to mutable objects (e.g., collections), return a defensive copy or use an immutable variant
     */

    private final String name;
    private final int age;

    private final HashMap<String, String> map;

    public ImmutableClassExample(String name, int age, HashMap<String, String> map) {
        this.name = name;
        this.age = age;

        HashMap<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        this.map = tempMap;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public HashMap<String, String> getMap() {
        return (HashMap<String, String>) map.clone();
    }

}

class MainClass {
    public static void main(String[] args) {
        ImmutableClassExample immutableClassExample = new ImmutableClassExample("Reddy", 27, new HashMap<>() {
            {
                put("1", "Apple");
                put("2", "Banana");
            }
        });

        System.out.println("Age: " + immutableClassExample.getAge());
        System.out.println("Map: " + immutableClassExample.getMap());
    }
}
