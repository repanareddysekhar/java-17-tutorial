package org.example.interfacesexample;

public class UserInterface implements MyInterface {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        userInterface.doSomething();
    }

    @Override
    public void doSomething() {
        System.out.println("Doing somehting");
    }
}

interface MyInterface {
    void doSomething();
}