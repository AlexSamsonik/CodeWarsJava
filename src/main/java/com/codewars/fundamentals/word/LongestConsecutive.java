package com.codewars.fundamentals.word;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Consecutive strings
 * You are given an array strarr of strings and an integer k. Your task is to return the first longest string
 * consisting of k consecutive strings taken in the array.
 * <p>
 * Example:
 * longestConsecutive(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"
 * <p>
 * n being the length of the string array, if n = 0 or k > n or k <= 0 return "".
 * <p>
 * Note
 * consecutive strings : follow one after another without an interruption
 */
public class LongestConsecutive {
    public static String longestConsec(String[] strarr, int k) {
        if ((strarr.length == 0) || (k > strarr.length) || (k <= 0)) {
            return "";
        } else {
            List<String> word = new ArrayList<>();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < strarr.length - (k - 1); i++) {
                for (int j = 0; j < k; j++) {
                    sb.append(strarr[i + j]).toString();
                }
                word.add(sb.toString());
                sb.setLength(0);
            }

            return word.stream()
                    .filter(w -> w.equals(Collections.max(word, Comparator.comparing(String::length))))
                    .findFirst().get();
        }
    }
}