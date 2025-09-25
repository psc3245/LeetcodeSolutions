# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if (head.next == None): return None
        sz = 0
        curr = head
        while curr:
            sz += 1
            curr = curr.next

        if n == sz: return head.next

        curr = head
        for _ in range(sz - n - 1):
            curr = curr.next

        curr.next = curr.next.next
        return head
        