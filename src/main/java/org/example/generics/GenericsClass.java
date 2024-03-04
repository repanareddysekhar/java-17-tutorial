package org.example.generics;

import java.util.Stack;

public class GenericsClass<T> {

    /**
     * 1. In a nutshell, generics enable types [Interfaces and classes] to be parameters when defining classes, interfaces and methods.
     * 2. Generics define compile type safety.
     */

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        GenericsClass<String> genericsExample = new GenericsClass<>();
        genericsExample.setT("ABC");
        System.out.println(genericsExample.getT());
        System.out.println(genericsExample.getClass());
        System.out.println(genericsExample.getT().getClass());

        GenericsClass genericsExample1 = new GenericsClass();
    }
}
