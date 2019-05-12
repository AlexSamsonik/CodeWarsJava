package com.codewars.fundamentals.number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Sudoku Solution Validator
 * Sudoku Background
 * Sudoku is a game played on a 9x9 grid. The goal of the game is to fill all cells of the grid with digits from 1 to 9,
 * so that each column, each row, and each of the nine 3x3 sub-grids (also known as blocks) contain all of the digits
 * from 1 to 9.
 * (More info at: http://en.wikipedia.org/wiki/Sudoku)
 * Sudoku Solution Validator
 * Write a function validSolution/ValidateSolution/valid_solution() that accepts a 2D array representing a Sudoku board,
 * and returns true if it is a valid solution, or false otherwise. The cells of the sudoku board may also contain 0's,
 * which will represent empty cells. Boards containing one or more zeroes are considered to be invalid solutions.
 * <p>
 * The board is always 9 cells by 9 cells, and every cell only contains integers from 0 to 9.
 * <p>
 * Examples
 * validSolution([
 * [5, 3, 4, 6, 7, 8, 9, 1, 2],
 * [6, 7, 2, 1, 9, 5, 3, 4, 8],
 * [1, 9, 8, 3, 4, 2, 5, 6, 7],
 * [8, 5, 9, 7, 6, 1, 4, 2, 3],
 * [4, 2, 6, 8, 5, 3, 7, 9, 1],
 * [7, 1, 3, 9, 2, 4, 8, 5, 6],
 * [9, 6, 1, 5, 3, 7, 2, 8, 4],
 * [2, 8, 7, 4, 1, 9, 6, 3, 5],
 * [3, 4, 5, 2, 8, 6, 1, 7, 9]
 * ]); // => true
 * <p>
 * validSolution([
 * [5, 3, 4, 6, 7, 8, 9, 1, 2],
 * [6, 7, 2, 1, 9, 0, 3, 4, 8],
 * [1, 0, 0, 3, 4, 2, 5, 6, 0],
 * [8, 5, 9, 7, 6, 1, 0, 2, 0],
 * [4, 2, 6, 8, 5, 3, 7, 9, 1],
 * [7, 1, 3, 9, 2, 4, 8, 5, 6],
 * [9, 0, 1, 5, 3, 7, 2, 1, 4],
 * [2, 8, 7, 4, 1, 9, 6, 3, 5],
 * [3, 0, 0, 4, 8, 1, 1, 7, 9]
 * ]); // => false
 */
public class SudokuValidator {
    public static boolean check(int[][] sudoku) {
        if (Arrays.stream(sudoku).anyMatch(s -> Arrays.stream(s).anyMatch(ss -> ss == 0))) {
            return false;
        }
        int result = 0;

        for (int i = 0; i < sudoku.length; i++) {
            if (checkOneToNine(sudoku[i])) {
                result = result + 1;
            }
        }

        for (int i = 0; i < sudoku.length; i++) {
            if (checkOneToNine(checkColumn(sudoku, i))) {
                result = result + 1;
            }
        }

        for (int i = 0; i < 7; i = i + 3) {
            for (int j = 0; j < 7; j = j + 3) {
                if (checkOneToNine(checkBlock(sudoku, i, j))) {
                    result = result + 1;
                }
            }
        }

        return result == 27;
    }

    private static boolean checkOneToNine(int[] array) {
        return Arrays.stream(array).distinct().count() == 9;
    }

    private static int[] checkColumn(int[][] sudoku, int indexColumn) {
        int[] column = new int[9];
        for (int i = 0; i < sudoku.length; i++) {
            column[i] = sudoku[i][indexColumn];
        }
        return column;
    }

    private static int[] checkBlock(int[][] sudoku, int iBlock, int jBlock) {
        ArrayList list = new ArrayList();
        for (int i = iBlock; i < iBlock + 3; i++) {
            for (int j = jBlock; j < jBlock + 3; j++) {
                list.add(sudoku[i][j]);
            }
        }
        return list.stream().mapToInt(i -> (int) i).toArray();
    }

    /**
     * Best solution on CodeWars
     */
    public static boolean checkCodeWars(int[][] sudoku) {
        return checkForZeros(sudoku) ? checkRows(sudoku) && checkCols(sudoku) && checkSquares(sudoku) : false;
    }

    private static boolean checkForZeros(int[][] sudoku) {
        for (int[] row : sudoku)
            for (int val : row)
                if (val == 0)
                    return false;
        return true;
    }

    private static boolean checkRows(int[][] sudoku) {
        Set<Integer> set = new HashSet<Integer>();
        for (int[] row : sudoku) {
            set.clear();
            for (int val : row)
                set.add(val);
            if (set.size() != 9)
                return false;
        }
        return true;
    }

    private static boolean checkCols(int[][] sudoku) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 9; i++) {
            set.clear();
            for (int j = 0; j < 9; j++)
                set.add(sudoku[j][i]);
            if (set.size() != 9)
                return false;
        }
        return true;
    }

    private static boolean checkSquares(int[][] sudoku) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 9; i++) {
            int a = i % 3 * 3;
            int b = a + 2;
            int c = 3 * (i / 3);
            int d = c + 2;
            set.clear();
            for (int j = a; j <= b; j++)
                for (int k = c; k <= d; k++)
                    set.add(sudoku[j][k]);
            System.out.println(set);
            if (set.size() != 9)
                return false;
        }
        return true;
    }
}