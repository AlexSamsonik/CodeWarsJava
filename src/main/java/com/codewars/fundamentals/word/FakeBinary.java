package com.codewars.fundamentals.word;

/**
 * FakeBinary.
 * Given a string of digits, you should replace any digit below 5 with '0' and
 * any digit 5 and above with '1'.
 * Return the resulting string.
 */
public class FakeBinary {
    public static String fakeBin(String numberString) {
        String[] word = numberString.split("");
        int[] numbers = new int[word.length];
        for (int i = 0; i < word.length; i++) {
            int j = Integer.parseInt(word[i]);
            if (j < 5)
                numbers[i] = 0;
            else numbers[i] = 1;
        }
        String fBin = "";
        for (int i = 0; i < numbers.length; i++) {
            String j = Integer.toString(numbers[i]);
            fBin = fBin.concat(j);
        }
        return fBin;
    }

    /**
     * Best solution on CodeWars
     */
    public static String fakeBinCodeWars(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}