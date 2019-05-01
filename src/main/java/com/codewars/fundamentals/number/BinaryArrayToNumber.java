package com.codewars.fundamentals.number;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ones and Zeros
 * Given an array of one's and zero's convert the equivalent binary value to an integer.
 * Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
 * However, the arrays can have varying lengths, not just limited to 4.
 */
public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder sb = new StringBuilder();
        binary.forEach(sb::append);
        return Integer.parseInt(sb.toString(), 2);
    }

    /**
     * Best solution on CodeWars
     */
    public static int ConvertBinaryArrayToIntCodeWars(List<Integer> binary) {
       return Integer.parseInt(binary.stream().map(String::valueOf).collect(Collectors.joining()), 2);
    }
}