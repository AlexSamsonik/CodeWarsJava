package com.codewars.fundamentals.number;

import java.util.Arrays;

/**
 * Find The Parity Outlier
 * You are given an array (which will have a length of at least 3, but could be very large) containing integers.
 * The array is either entirely comprised of odd integers or entirely comprised of even integers except for
 * a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.
 * Examples
 * [2, 4, 0, 100, 4, 11, 2602, 36]
 * Should return: 11 (the only odd number)
 * [160, 3, 1719, 19, 11, 13, -21]
 * Should return: 160 (the only even number)
 */
public class FindOutlier {
    public static int find(int[] integers) {
        int[] odd = Arrays.stream(integers).filter(i -> i % 2 != 0).toArray();
        int[] even = Arrays.stream(integers).filter(i -> i % 2 == 0).toArray();
        if (odd.length == 1) {
            return odd[0];
        }
        if (even.length == 1) {
            return even[0];
        }
        return 0;
    }

    /**
     * Best solution on COdeWars
     */
    static int findCodeWars(int[] integers) {
        int[] array = Arrays.stream(integers).filter(i -> i % 2 == 0).toArray();
        return array.length == 1 ? array[0] : Arrays.stream(integers).filter(i -> i % 2 != 0).findAny().getAsInt();
    }
}