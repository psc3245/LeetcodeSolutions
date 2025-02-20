import HelperClasses.ListNode;
import HelperClasses.TreeNode;
import Medium.Valid_Sudoku_36.Solution;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Invalid case 4: Failing test case
        char[][] invalidBoard4 = {
                {'1', '2', '.', '.', '3', '.', '.', '.', '.'},
                {'4', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '9', '1', '.', '.', '.', '.', '.', '3'},
                {'5', '.', '.', '.', '6', '.', '.', '.', '4'},
                {'.', '.', '.', '8', '.', '3', '.', '.', '5'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '.', '.', '.', '.', '.', '2', '.', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '8'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println("Test 6 (Invalid - Failing case) - Expected: false, Result: " + solution.isValidSudoku(invalidBoard4));


    }
}