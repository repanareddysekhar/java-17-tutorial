package org.example;

public class Main {
    public static void main(String[] args) {
        RecordPerson person = new RecordPerson("Reddy", "Bangalore");

        System.out.println(person.address());
        System.out.println(person.name());
        // access the static fields
        System.out.println(RecordPerson.UN_KNOWN);
    }
}