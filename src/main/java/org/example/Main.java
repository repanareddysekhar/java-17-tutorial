package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RecordPerson person = new RecordPerson("Reddy", "Bangalore");

        System.out.println(person.address());
        System.out.println(person.name());
        // access the static fields
        System.out.println(RecordPerson.UN_KNOWN);

        String[] arr = new String[0];
        System.out.println(arr.length);
    }
}

class MinimumAmount {
    public static int findMinimumAmount(int[] prices, int m) {
        Arrays.sort(prices);
        int n = prices.length;
        int totalCost = 0;

        for (int i = n - 1; i >= 0; i--) {
            int couponsUsed = Math.min(m, (int) Math.floor(Math.log(prices[i]) / Math.log(2)));
            int discountedPrice = prices[i] / (int) Math.pow(2, couponsUsed);

            totalCost += discountedPrice;

            m -= couponsUsed;
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[] prices = {1};
        int m = 1;

        int minimumAmount = findMinimumAmount(prices, m);
        System.out.println("Minimum amount needed: " + minimumAmount);
    }
}