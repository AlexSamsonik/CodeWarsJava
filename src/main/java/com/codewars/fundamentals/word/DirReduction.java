package com.codewars.fundamentals.word;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Directions Reduction
 * <p>
 * Once upon a time, on a way through the old wild west,…
 * … a man was given directions to go from one point to another. The directions were "NORTH", "SOUTH", "WEST", "EAST".
 * Clearly "NORTH" and "SOUTH" are opposite, "WEST" and "EAST" too. Going to one direction and coming back the opposite
 * direction is a needless effort. Since this is the wild west, with dreadfull weather and not much water, it's important
 * to save yourself some energy, otherwise you might die of thirst!
 * <p>
 * How I crossed the desert the smart way.
 * The directions given to the man are, for example, the following (depending on the language):
 * <p>
 * ["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"].
 * or
 * <p>
 * { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" };
 * or
 * <p>
 * [North, South, South, East, West, North, West]
 * You can immediatly see that going "NORTH" and then "SOUTH" is not reasonable, better stay to the same place!
 * So the task is to give to the man a simplified version of the plan. A better plan in this case is simply:
 * <p>
 * ["WEST"]
 * or
 * <p>
 * { "WEST" }
 * or
 * <p>
 * [West]
 * Other examples:
 * In ["NORTH", "SOUTH", "EAST", "WEST"], the direction "NORTH" + "SOUTH" is going north and coming back right away.
 * What a waste of time! Better to do nothing.
 * <p>
 * The path becomes ["EAST", "WEST"], now "EAST" and "WEST" annihilate each other, therefore, the final result is [] (nil in Clojure).
 * <p>
 * In ["NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"], "NORTH" and "SOUTH" are not directly opposite but they become
 * directly opposite after the reduction of "EAST" and "WEST" so the whole path is reducible to ["WEST", "WEST"].
 * <p>
 * Task
 * Write a function dirReduc which will take an array of strings and returns an array of strings with the needless
 * directions removed (W<->E or S<->N side by side).
 * <p>
 * The Haskell version takes a list of directions with data Direction = North | East | West | South.
 * The Clojure version returns nil when the path is reduced to nothing.
 * The Rust version takes a slice of enum Direction {NORTH, SOUTH, EAST, WEST}.
 * See more examples in "Sample Tests:"
 * Notes
 * Not all paths can be made simpler. The path ["NORTH", "WEST", "SOUTH", "EAST"] is not reducible.
 * "NORTH" and "WEST", "WEST" and "SOUTH", "SOUTH" and "EAST" are not directly opposite of each other and can't become such.
 * Hence the result path is itself : ["NORTH", "WEST", "SOUTH", "EAST"].
 * if you want to translate, please ask before translating.
 */
public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        int length = 0;
        while (length != list.size()) {
            length = list.size();
            for (int j = 0; j < list.size() - 1; j++) {
                if (Directions.NORTH.getType().equals(list.get(j)) && Directions.SOUTH.getType().equals(list.get(j + 1)) ||
                        Directions.SOUTH.getType().equals(list.get(j)) && Directions.NORTH.getType().equals(list.get(j + 1)) ||
                        Directions.EAST.getType().equals(list.get(j)) && Directions.WEST.getType().equals(list.get(j + 1)) ||
                        Directions.WEST.getType().equals(list.get(j)) && Directions.EAST.getType().equals(list.get(j + 1))) {
                    list.remove(j);
                    list.remove(j);
                    break;
                }
            }
            if (length == list.size()) {
                break;
            }
        }
        return list.toArray(new String[0]);
    }

    public enum Directions {
        NORTH("NORTH"),
        SOUTH("SOUTH"),
        EAST("EAST"),
        WEST("WEST");

        private String type;

        Directions(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    /**
     * First best solution on CodeWars
     *
     * @param arr
     * @return String
     */
    public static String[] dirReducCodeWarsFirstSolution(String[] arr) {
        final Stack<String> stack = new Stack<>();

        for (final String direction : arr) {
            final String lastElement = stack.size() > 0 ? stack.lastElement() : null;

            switch(direction) {
                case "NORTH": if ("SOUTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "SOUTH": if ("NORTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "EAST":  if ("WEST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "WEST":  if ("EAST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
            }
        }
        return stack.stream().toArray(String[]::new);
    }

    /**
     * Second best solution on CodeWars
     *
     * @param arr
     * @return String
     */
    public static String[] dirReducSecondSolution(String[] arr) {
        List<String> dirs = new ArrayList<String>(Arrays.asList(arr));
        for (int i = 0; i + 1 < dirs.size(); i++) {
            if ("NORTHSOUTH,SOUTHNORTH,EASTWEST,WESTEAST".contains(dirs.get(i) + dirs.get(i + 1))) {
                dirs.remove(i + 1);
                dirs.remove(i);
                i = -1;
            }
        }
        return dirs.toArray(new String[dirs.size()]);
    }
}