package Merge_Sorted_Lists_21;

import HelperClasses.ListNode;

public class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 != null) return list2;
        if (list2 == null) return list1;

        ListNode head;
        if (list1.val < list2.val) {
            head = list1;
            list1 = list1.next;
        }
        else {
            head = list2;
            list2 = list2.next;
        }
        head.next = null;

        ListNode current = head;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                current.next = list2;
                list2 = list2.next;
                current = current.next;
                continue;
            }
            if (list2 == null) {
                current.next = list1;
                list1 = list1.next;
                current = current.next;
                continue;
            }

            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            }
            else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;

        }
        return head;
    }
}
