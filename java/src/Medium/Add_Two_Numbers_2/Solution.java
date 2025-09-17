package Medium.Add_Two_Numbers_2;

import HelperClasses.ListNode;

public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(l1.val + l2.val);

        int carry = 0;
        if (root.val >= 10) {
            root.val -= 10;
            carry = 1;
        }

        ListNode curr = root;

        while (l1.next != null || l2.next != null) {
            ListNode next = new ListNode(0);
            if (l1.next != null) {
                next.val += l1.next.val;
                l1 = l1.next;
            }
            if (l2.next != null) {
                next.val += l2.next.val;
                l2 = l2.next;
            }
            if (carry > 0) {
                next.val += carry;
                carry = 0;
            }
            if (next.val >= 10) {
                carry = 1;
                next.val -= 10;
            }
            curr.next = next;
            curr = curr.next;

        }
        if (carry != 0) {
            curr.next = new ListNode(carry);
        }

        return root;
    }
}
