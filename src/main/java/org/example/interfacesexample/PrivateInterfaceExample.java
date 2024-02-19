package org.example.interfacesexample;


interface MyPrivateInterface {
    default void doSomething() {
        System.out.println("Public default method");
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("Private method");
    }
}

public class PrivateInterfaceExample implements MyPrivateInterface{
    public static void main(String[] args) {
        PrivateInterfaceExample example = new PrivateInterfaceExample();
        example.doSomething();
    }
}
