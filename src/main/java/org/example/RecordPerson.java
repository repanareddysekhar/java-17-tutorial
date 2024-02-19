package org.example;

public record RecordPerson(String name, String address) {
    public static String UN_KNOWN = "Unknown";
    public RecordPerson() {
        this(null, null);
    }
}
