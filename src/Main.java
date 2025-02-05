import HelperClasses.ListNode;
import HelperClasses.TreeNode;
import Easy.Subtree_Of_Another_Tree_572.Solution;


public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        TreeNode subRoot = new TreeNode(1);
        System.out.println(Solution.isSubtree(root, subRoot));

    }

}
