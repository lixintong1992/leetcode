# 2. Add Two Numbers

# Definition for singly-linked list.


class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        sum = 0
        r_l = ListNode(0)
        temp = r_l
        while (l1 is not None) or (l2 is not None):
            sum /= 10
            if(l1 is not None):
                sum += l1.val
                l1 = l1.next
            if(l2 is not None):
                sum += l2.val
                l2 = l2.next

            r_l.next = ListNode(sum % 10)
            r_l = r_l.next
        if sum >= 10:
            r_l.next = ListNode(1)

        return temp.next
