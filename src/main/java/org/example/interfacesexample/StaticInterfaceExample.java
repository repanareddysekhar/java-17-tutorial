package org.example.interfacesexample;

public class StaticInterfaceExample implements MyStaticInterface{
    public static void main(String[] args) {
        StaticInterfaceExample example = new StaticInterfaceExample();
        example.doSomething();
        MyStaticInterface.doAnotherThing();
    }

    @Override
    public void doSomething() {
        System.out.println("Doing something");
    }
}

interface MyStaticInterface {
    void doSomething();

    static void doAnotherThing() {
        System.out.println("Doing another thing");
    }
}
