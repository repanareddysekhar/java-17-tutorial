package org.example;

public class MethodOverloading {

    /**
     * This demonstrates how method overloading provides flexibility in method signatures, allowing you to use the same method name with different parameter types or numbers of parameters. The varargs feature further enhances this flexibility by allowing a variable number of arguments.
     */


    public int add(int a, int b) {
        return a+ b;
    }

    public int add(int a) {
        return a;
    }

    // varargs - variable argument list
    public int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }


    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();

        System.out.println("methodOverloading.add(a): " + methodOverloading.add(10));
        System.out.println("methodOverloading.add(a, a): " + methodOverloading.add(10, 10));
        System.out.println("methodOverloading.add(a, a, a): " + methodOverloading.add(10, 10, 10));
    }
}
