package Medium.Count_Good_Nodes_BinTree_1448;

import HelperClasses.TreeNode;

public class Solution {
    // TODO
    public static int goodNodes(TreeNode root) {
        int pathMax = root.val;
        int total = 1;
        total += dfs(root.left, pathMax);
        total += dfs(root.right, pathMax);
        return total;
    }

    // just do dfs with a path max param
    public static int dfs(TreeNode root, int pathMax) {
        if (root == null) return 0;

        int total = 0;

        if (root.val >= pathMax) {
            total ++;
            pathMax = root.val;
        }

        total += dfs(root.left, pathMax);
        total += dfs(root.right, pathMax);

        return total;

    }

}
