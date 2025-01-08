import HelperClasses.ListNode;
import Merge_Sorted_Lists_21.*;

public class Main {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(5);

        ListNode head = Solution.mergeTwoLists(list1, list2);

        while (head != null) {
            System.out.print(head.val + ", ");
            head = head.next;
        }

    }


}
