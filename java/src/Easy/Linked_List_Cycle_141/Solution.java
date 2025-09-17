package Easy.Linked_List_Cycle_141;

import HelperClasses.ListNode;

import java.util.HashSet;

public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
