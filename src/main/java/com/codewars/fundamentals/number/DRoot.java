package com.codewars.fundamentals.number;

/**
 * Sum of Digits / Digital Root
 * In this kata, you must create a digital root function.
 * A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n.
 * If that value has more than one digit, continue reducing in this way until a single-digit number is produced.
 * This is only applicable to the natural numbers.
 * Here's how it works:
 * digital_root(16)
 * => 1 + 6
 * => 7
 * digital_root(942)
 * => 9 + 4 + 2
 * => 15 ...
 * => 1 + 5
 * => 6
 * digital_root(132189)
 * => 1 + 3 + 2 + 1 + 8 + 9
 * => 24 ...
 * => 2 + 4
 * => 6
 * digital_root(493193)
 * => 4 + 9 + 3 + 1 + 9 + 3
 * => 29 ...
 * => 2 + 9
 * => 11 ...
 * => 1 + 1
 * => 2
 */
public class DRoot {

    public static int digitalRoot(int n) {
        if (n % 10 == n) {
            return n;
        } else {
            return digital(n);
        }
    }

    private static int digital(Integer n) {
        char[] chars = n.toString().toCharArray();
        int result = 0;
        for (char aChar : chars) {
            result = result + Character.getNumericValue(aChar);
        }
        if (result % 10 != result) {
            return digital(result);
        }
        return result;
    }

    /**
     * Best solution on CodeWars
     */
    public static int digital_root(int n) {
        return (n != 0 && n % 9 == 0) ? 9 : n % 9;
    }
}