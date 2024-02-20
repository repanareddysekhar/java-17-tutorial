package org.example;

public class EnumTutorial {
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        System.out.println(day.getValue());
        System.out.println(day.name());
        day.sayHello();

        for (Day d : Day.values()) {
            System.out.println(d.ordinal());
            System.out.println(d.name());
            System.out.println(d.getValue());
        }

        System.out.println(Day.values());
    }
}

enum Day {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String value;

    Day(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void sayHello() {
        System.out.println("hello from " + this.name());
    }
}
