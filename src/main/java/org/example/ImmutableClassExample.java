package org.example;

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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ImmutableClassExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        ImmutableClassExample immutableClassExample = new ImmutableClassExample("Reddy", 27);

        System.out.println("Age: " + immutableClassExample.getAge());
    }
}
