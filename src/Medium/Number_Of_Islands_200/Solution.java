package Medium.Number_Of_Islands_200;

public class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        if (grid[0].length == 0) return 0;

        int numIslands = 0;

        for (int i  = 0; i < grid.length; i++) {
            for (int j  = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    doDFS(i, j, grid);
                    numIslands ++;
                }
            }
        }

        return numIslands;
    }

    public void doDFS(int x, int y, char[][] grid) {
        if (x >= grid.length || y >= grid[0].length || x < 0 || y < 0) return;

        if (grid[x][y] == '0') return;

        grid[x][y] = '0';

        if (x < grid.length - 1) {
            doDFS(x + 1, y, grid);
        }
        if (x >= 1) {
            doDFS(x - 1, y, grid);
        }
        if (y < grid[0].length - 1) {
            doDFS(x, y + 1, grid);
        }
        if (y >= 1) {
            doDFS(x, y - 1, grid);
        }
    }
}
