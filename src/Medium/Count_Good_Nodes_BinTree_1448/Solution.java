package Medium.Count_Good_Nodes_BinTree_1448;

import HelperClasses.TreeNode;

public class Solution {
    // TODO
    public static int goodNodes(TreeNode root) {
        int total = 1;
        if (root.left != null) {
            goodNodes(root.left);
        }
        if (root.right != null) {
            goodNodes(root.left);
        }
        return total;
    }

}
