package com.codewars.fundamentals.word.morse;

public class MorseCode {

    public static String get(String code) {

        switch (code) {
            case " ":
                code = null;
                break;
            case ".-":
                code = "A";
                break;
            case "-...":
                code = "B";
                break;
            case "-.-.":
                code = "C";
                break;
            case "-..":
                code = "D";
                break;
            case ".":
                code = "E";
                break;
            case "..-.":
                code = "F";
                break;
            case "--.":
                code = "G";
                break;
            case "....":
                code = "H";
                break;
            case "..":
                code = "I";
                break;
            case ".---":
                code = "J";
                break;
            case "-.-":
                code = "K";
                break;
            case ".-..":
                code = "L";
                break;
            case "--":
                code = "M";
                break;
            case "-.":
                code = "N";
                break;
            case "---":
                code = "O";
                break;
            case ".--.":
                code = "P";
                break;
            case "--.-":
                code = "Q";
                break;
            case ".-.":
                code = "R";
                break;
            case "...":
                code = "S";
                break;
            case "-":
                code = "T";
                break;
            case "..-":
                code = "U";
                break;
            case "...-":
                code = "V";
                break;
            case ".--":
                code = "W";
                break;
            case "-..-":
                code = "X";
                break;
            case "-.--":
                code = "Y";
                break;
            case "--..":
                code = "Z";
                break;
        }
        return code;
    }
}
