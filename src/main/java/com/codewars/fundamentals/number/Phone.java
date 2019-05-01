package com.codewars.fundamentals.number;


import java.util.Arrays;

/**
 * Create Phone Number
 * Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
 * Example:
 * Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
 * The returned format must be correct in order to complete this challenge.
 * Don't forget the space after the closing parentheses!
 */

public class Phone {
    public static String createPhoneNumber(int[] numbers) {
        StringBuffer sb = new StringBuffer(Arrays.toString(numbers).replaceAll("[\\[, \\]]", ""));
        sb.insert(0, "(");
        sb.insert(4, ") ");
        sb.insert(9, "-");
        return sb.toString();
    }

    /**
     * Best solution on CodeWars
     */
    private static String PHONE_FORMAT = "(%d%d%d) %d%d%d-%d%d%d%d";
    public static String createPhoneNumberCodeWars(int[] numbers) {
        Integer[] numbersInt = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        return String.format(PHONE_FORMAT, (Object) numbersInt);
    }
}