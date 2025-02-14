import HelperClasses.ListNode;
import HelperClasses.TreeNode;
import Hard.Trapping_Rain_Water_42.Solution;


public class Main {
    public static void main(String[] args) {
        int[] arr = {0,2,0,3,1,0,1,3,2,1}; // expected 9
        System.out.println(Solution.trap(arr));
        int[] arr2 = {0,1,0,2,1,0,1,3,2,1,2,1}; //expected 6
        System.out.println(Solution.trap(arr2));
        int[] arr3 = {4,2,0,3,2,5}; // expected 9
        System.out.println(Solution.trap(arr3));
        int[] arr4 = {4,2,3}; // expected 1
        System.out.println(Solution.trap(arr4));

    }

}
