package Medium.Valid_Sudoku_36;

import java.util.HashSet;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                HashSet<Character> contained = new HashSet<>();
                if (contained.contains(board[i][j])) return false;
                if (board[i][j] != ',') contained.add(board[i][j]);
            }
        }

        return false;

    }

    public boolean checkSquare(int row, int col, char[][] board) {
        HashSet<Character> contained = new HashSet<>();
        for (int i = row; i < row + 2; i ++) {
            for (int j = col; j < col + 2; i ++) {
                if (board[i][j] != '.') {
                    if (contained.contains(board[row][i])) return false;
                    else contained.add(board[row][i]);
                }
            }
        }
        return true;
    }

    public boolean checkRow(int row, char[][] board) {
        HashSet<Character> contained = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            if (board[row][i] != '.') {
                if (contained.contains(board[row][i])) return false;
                else contained.add(board[row][i]);
            }
        }
        return true;
    }

    public boolean checkCol(int col, char[][] board) {
        HashSet<Character> contained = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            if (board[i][col] != '.') {
                if (contained.contains(board[i][col])) return false;
                else contained.add(board[i][col]);
            }
        }
        return true;
    }
}
