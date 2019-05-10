package com.codewars.fundamentals.word;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Write a function that takes in a string of one or more words, and returns the same string, but with all five or
 * more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and
 * spaces. Spaces will be included only when more than one word is present.
 * Examples:
 * spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
 * spinWords( "This is a test") => returns "This is a test"
 * spinWords( "This is another test" )=> returns "This is rehtona test"
 */
public class SpinWords {
    public String spinWords(String sentence) {
        String[] str = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() < 5) {
                sb.append(str[i]).append(" ");
            } else {
                sb.append((new StringBuilder(str[i])).reverse().append(" "));
            }
        }
        return sb.toString().trim();
    }

    /**
     * Best solution on CodeWars
     */
    public String spinWordsCodeWars(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                .collect(Collectors.joining(" "));
    }
}