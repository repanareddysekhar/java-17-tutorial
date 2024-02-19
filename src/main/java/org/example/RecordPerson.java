package org.example;

public record RecordPerson(String name, String address) {
    public RecordPerson() {
        this(null, null);
    }
}
