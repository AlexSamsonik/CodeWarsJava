package com.codewars.fundamentals.number;

import java.util.Arrays;

/**
 * Find the unique number
 * There is an array with some numbers. All numbers are equal except for one. Try to find it!
 * <p>
 * Kata.findUnique(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
 * Kata.findUnique(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
 * It’s guaranteed that array contains more than 3 numbers.
 * <p>
 * The tests contain some very huge arrays, so think about performance.
 */
public class UniqueNumber {
    public static double findUnique(double arr[]) {
        double result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ": " + arr[i]);
            if (i == 0) {
                if (arr[i] == arr[i + 1] && arr[i + 1] == arr[i + 2]) {
                    continue;
                }
                if (arr[i + 1] == arr[i + 2]) {
                    break;
                }
            }
            if (arr[i] != result) {
                result = arr[i];
                break;
            }
        }
        return result;
    }

    /**
     * Best solution on CodeWars
     */
    public static double findUniq(double[] arr) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
    }
}