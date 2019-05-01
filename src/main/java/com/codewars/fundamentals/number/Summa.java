package com.codewars.fundamentals.number;

import java.util.stream.IntStream;

public class Summa {

    /**
     * Sum of positive
     * You get an array of numbers, return the sum of all of the positives ones.
     * Example [1,-4,7,12] => 1 + 7 + 12 = 20
     * Note: if there is nothing to sum, the sum is default to 0.
     */
    public static int sumOfPositive(int[] arr) {

        int s = 0;
        if (arr.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    s = s + arr[i];
                }
            }
            return s;
        }
    }

    /**
     * Beginner Series #3 Sum of Numbers
     * Given two integers a and b, which can be positive or negative, find the sum of all the numbers between including them too and return it. If the two numbers are equal return a or b.
     * Note: a and b are not ordered!
     * <p>
     * Examples:
     * getSum(1, 0) == 1   // 1 + 0 = 1
     * getSum(1, 2) == 3   // 1 + 2 = 3
     * getSum(0, 1) == 1   // 0 + 1 = 1
     * getSum(1, 1) == 1   // 1 Since both are same
     * getSum(-1, 0) == -1 // -1 + 0 = -1
     * getSum(-1, 2) == 2  // -1 + 0 + 1 + 2 = 2
     */
    public static int getSum(int a, int b) {

        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int sum = 0;

        if (a == b) {
            return a;
        } else {
            for (int i = min; i <= max; i++) {
                sum = sum + i;
            }
        }
        return sum;
    }

    /**
     * Best solution from Beginner Series #3 Sum of Numbers on CodeWars
     */
    public static int getSumCodeWars(int a, int b) {
        return IntStream.rangeClosed(Math.min(a, b), Math.max(a, b)).sum();
    }
}