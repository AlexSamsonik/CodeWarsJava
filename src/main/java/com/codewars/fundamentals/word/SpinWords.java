package com.codewars.fundamentals.word;

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
}