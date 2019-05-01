package com.codewars.fundamentals.word;

/**
 * Description:
 * Vowels Count
 * Return the number(count)of vowels in the given string.
 * We will consider a,e,i,o,and u as vowels for this Kata.
 * The input string will only consist of lower case letters and/or spaces.
 */

public class Vowels {
    public static int getCount(String str) {
        String[] letters = str.split("");
        String[] vowels = {"a", "e", "i", "o", "u"};

        int vowelsCount = 0;
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (letters[i].equals(vowels[j]))
                    vowelsCount = vowelsCount + 1;
            }
        }
        return vowelsCount;
    }

    /**
     * Best solution on CodeWars
     */
    public static int getCountCodeWars(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }
}