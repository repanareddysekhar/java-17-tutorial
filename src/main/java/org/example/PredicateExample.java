package org.example;

import java.util.function.Predicate;

public class PredicateExample {

    interface Target {
        boolean needToAim(double angle);
    }
    static void prepare(double angle, Target t) {
        boolean ready = t.needToAim(angle); // k1
         System.out.println(ready);
    }
    public static void main(String[] args) {
        // Predicates are functional interfaces that represents boolean valued function of one argument

        Predicate<Integer> isGreaterThan15 = num -> num > 15;

        System.out.println(isGreaterThan15.test(19));
        System.out.println(isGreaterThan15.test(10));
        Predicate<String> p =  (s) -> false;

        prepare(45,d->d>5||d<-5);

    }
}
