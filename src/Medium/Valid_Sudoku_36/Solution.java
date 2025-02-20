package Medium.Valid_Sudoku_36;

import java.util.HashSet;

public class Solution {
    public Solution() {}

    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] squares = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            squares[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // Check the row
                char num = board[i][j];
                if (num != '.') {
                    // Check the row
                    if (rows[i].contains(num)) return false;
                    rows[i].add(num);

                    // Check the col
                    if (cols[j].contains(num)) return false;
                    cols[j].add(num);

                    // Check the square
                    int index = (i / 3) * 3 + (j / 3);
                    if (squares[index].contains(num)) return false;
                    squares[index].add(num);
                }
            }
        }
        return true;
    }
}
