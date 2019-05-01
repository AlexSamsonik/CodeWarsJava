package com.codewars.fundamentals.number;

/**
 * Convert number to reversed array of digits
 * Given a random number:
 * You have to return the digits of this number within an array in reverse order.
 */
public class Reverse {
    public static int[] digitize(long n) {
        String s = new StringBuffer(Long.toString(n)).reverse().toString();
        String[] a = s.split("");
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = Integer.valueOf(a[i]);
        }
        return result;
    }

    /**
     * Best solution on CodeWars
     */
    public static int[] digitizeCodeWars(long n) {
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}