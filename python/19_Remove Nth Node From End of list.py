# 19. Remove Nth Node From End of list
# Definition for singly-linked list.


class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        pre_node = head
        later_node = head
        for i in xrange(n):
            later_node = later_node.next
        if later_node is None:
            head = head.next
            return head
        while later_node.next is not None:
            pre_node = pre_node.next
            later_node = later_node.next
        pre_node.next = pre_node.next.next
        return head
