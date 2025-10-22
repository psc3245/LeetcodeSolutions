from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        
        ctr = 0
        curr = head
        while curr:
            ctr += 1
            curr = curr.next

        mid = head
        for _ in range((ctr + 1) // 2 - 1):
            mid = mid.next
        l2 = mid.next
        mid.next = None
        l2 = self.reverse(l2)

        l1 = head
        while l1 and l2:
            t1, t2 = l1.next, l2.next
            l1.next = l2
            l2.next = t1
            l1, l2 = t1, t2
                
        self.printList(head)
        

    def reverse(self, head):
        prev = None
        curr = head

        while curr:
            next_temp = curr.next
            curr.next = prev
            prev = curr
            curr = next_temp

        return prev
    
    def printList(self, head):
        while head:
            print(head.val)
            head = head.next
 
 
def main():
    case1 = ListNode(2)
    case1.next = ListNode(4)
    case1.next.next = ListNode(6)   
    case1.next.next.next = ListNode(8)
    
    Solution().reorderList(case1)
    
    case2 = ListNode(2)
    case2.next = ListNode(4)
    case2.next.next = ListNode(6)   
    case2.next.next.next = ListNode(8)   
    case2.next.next.next.next = ListNode(10)   
    
       
    
if __name__ == "__main__":
    main()
        