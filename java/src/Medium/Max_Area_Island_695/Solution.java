package Medium.Max_Area_Island_695;

public class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid.length == 0) return 0;
        if (grid[0].length == 0) return 0;

        int largestIsland = 0;

        for (int i  = 0; i < grid.length; i++) {
            for (int j  = 0; j < grid[0].length; j++) {
                int islandSize = doDFS(i, j, grid);
                if (islandSize > largestIsland) largestIsland = islandSize;
            }
        }

        return largestIsland;
    }

    public int doDFS(int x, int y, int[][] grid) {
        if (x >= grid.length || y >= grid[0].length || x < 0 || y < 0) return 0;

        if (grid[x][y] == 0) return 0;

        grid[x][y] = 0;

        int islandSize = 1;

        if (x < grid.length - 1) {
            islandSize += doDFS(x + 1, y, grid);
        }
        if (x >= 1) {
            islandSize += doDFS(x - 1, y, grid);
        }
        if (y < grid[0].length - 1) {
            islandSize += doDFS(x, y + 1, grid);
        }
        if (y >= 1) {
            islandSize += doDFS(x, y - 1, grid);
        }

        return islandSize;
    }
}
