package com.codewars.fundamentals.number;

/**
 * Persistent Bugger
 * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
 * which is the number of times you must multiply the digits in num until you reach a single digit.
 * For example:
 * *  persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
 * // and 4 has only one digit
 * *  persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
 * // 1*2*6 = 12, and finally 1*2 = 2
 * *  persistence(4) == 0 // because 4 is already a one-digit number
 */
public class Persist {
    public static int persistence(long n) {
        if (n % 10 == n) {
            return 0;
        } else {
            int c = 1;
            return digital(n, c);
        }
    }

    private static int digital(Long n, int c) {
        char[] chars = n.toString().toCharArray();
        long result = 1;
        for (char aChar : chars) {
            result = result * Character.getNumericValue(aChar);
        }
        if (result % 10 != result) {
            c++;
            return digital(result, c);
        }
        return c;
    }
}