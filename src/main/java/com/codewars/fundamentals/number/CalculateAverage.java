package com.codewars.fundamentals.number;

import static java.util.Arrays.stream;

/**
 * Calculate average
 * Write function avg which calculates average of numbers in given list.
 */
public class CalculateAverage {
    public static double find_average(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double avg = sum / array.length;
        return avg;
    }

    /**
     * Best solution on CodeWars
     */
    public static double find_average_CodeWars(int[] array) {
        return stream(array).average().getAsDouble();
    }
}