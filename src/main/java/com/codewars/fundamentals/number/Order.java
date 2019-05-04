package com.codewars.fundamentals.number;

/**
 * Your order, please
 * Your task is to sort a given string. Each word in the string will contain a single number. This number is
 * the position the word should have in the result.
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 * If the input string is empty, return an empty string. The words in the input String will only contain valid
 * consecutive numbers.
 * <p>
 * Examples
 * "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
 * "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
 * ""  -->  ""
 */
public class Order {
    public static String order(String words) {
        if (words.equals("")) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String[] number = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] str = words.split(" ");
        for (String value : number) {
            for (String s : str) {
                if (s.contains(value)) {
                    sb.append(s).append(" ");
                }
            }
        }
        return sb.toString().trim();
    }

    /**
     * Upgrade my solution
     */
    public static String orderCodeWars(String words) {
        String[] arr = words.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (String s : arr) {
                if (s.contains(String.valueOf(i))) {
                    result.append(s).append(" ");
                }
            }
        }
        return result.toString().trim();
    }
}