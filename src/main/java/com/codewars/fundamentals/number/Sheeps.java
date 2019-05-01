package com.codewars.fundamentals.number;

/**
 * Counting sheep...
 * Consider an array of sheep where some sheep may be missing from their place. We need a function that counts
 * the number of sheep present in the array (true means present).
 * <p>
 * For example,
 * [true,  true,  true,  false,
 * true,  true,  true,  true ,
 * true,  false, true,  false,
 * true,  false, false, true ,
 * true,  true,  true,  true ,
 * false, false, true,  true]
 * <p>
 * The correct answer would be 17.
 * <p>
 * Hint: Don't forget to check for bad values like null/undefined
 */
public class Sheeps {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            try {
                if (arrayOfSheeps[i] == null | !arrayOfSheeps[i]) {
                    count += 0;
                }
                if (arrayOfSheeps[i]) {
                    count += 1;
                }
            } catch (Exception ignored) {
            }
        }
        return count;
    }
}