# 328. Odd Even Linked list


# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution(object):
    def oddEvenList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if (head is not None):
            odd = head
            even = head.next
            evenHead = even
            while (even is not None) and (even.next is not None):
                odd.next = odd.next.next
                even.next = even.next.next
                odd = odd.next
                even = even.next

            odd.next = evenHead

        return head
