package com.codewars.fundamentals.word;

import java.util.List;

/**
 * Count the smiley faces!
 * Description:
 * Given an array (arr) as an argument complete the function countSmileys that should return the total number of
 * smiling faces.
 * Rules for a smiling face:
 * -Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
 * -A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
 * -Every smiling face must have a smiling mouth that should be marked with either ) or D.
 * No additional characters are allowed except for those mentioned.
 * Valid smiley face examples:
 * :) :D ;-D :~)
 * Invalid smiley faces:
 * ;( :> :} :]
 * Example cases:
 * countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
 * countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
 * countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;
 * Note: In case of an empty array return 0. You will not be tested with invalid input (input will always be an array).
 * Order of the face (eyes, nose, mouth) elements will always be the same
 */
public class SmileFaces {
    public static int countSmileys(List<String> arr) {
        if (arr.size() == 0) {
            return 0;
        }
        return (int) arr.stream()
                .filter(s -> (s.matches("^:-?~?[)D]$")) || (s.matches("^;-?~?[)D]$")))
                .filter(us -> us.length() < 4)
                .count();
    }

    /**
     * Best solution on CodeWars
     */
    public static int countSmileysCodeWars(List<String> arr) {
        if (arr.size() == 0) {
            return 0;
        }
        return (int) arr.stream().filter(s -> s.matches("[:;][-~]?[)D]")).count();
    }
}