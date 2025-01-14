import HelperClasses.ListNode;
import HelperClasses.TreeNode;
import Medium.Add_Two_Numbers_2.Solution;


public class Main {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);

        Solution.addTwoNumbers(l1, l2);
//        TreeNode root = new TreeNode(2);
//        root.left = new TreeNode(1);
//        root.right = new TreeNode(1);
//        root.left.left = new TreeNode(5);
//        root.right.left = new TreeNode(1);
//        root.right.right = new TreeNode(5);
//        int a = Solution.goodNodesv1(root);
//        System.out.println(a);
    }

}
