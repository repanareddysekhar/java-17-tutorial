package org.example.interfacesexample;

public class DefaultInterfaceExample implements defaultInterface{
    public static void main(String[] args) {
        DefaultInterfaceExample example = new DefaultInterfaceExample();
        example.doSomething();
        example.doAnotherThing();
    }

    @Override
    public void doSomething() {
        System.out.println("Doing something");
    }
}

interface defaultInterface {
    void doSomething();

    default void doAnotherThing() {
        System.out.println("Doing another thing");
    }
}

