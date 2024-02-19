package org.example.interfacesexample;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface functionalInterface = () -> System.out.println("Performing action using functional interface");
        functionalInterface.performAction();
    }
}


@FunctionalInterface
interface MyFunctionalInterface {
    void performAction();
}
