# 232. Implement Queue using Stacks
class Queue(object):
    def __init__(self):
        """
        initialize your data structure here.
        """
        self.q1 = []

    def push(self, x):
        """
        :type x: int
        :rtype: nothing
        """
        self.q1.append(x)

    def pop(self):
        """
        :rtype: nothing
        """
        del self.q1[0]

    def peek(self):
        """
        :rtype: int
        """
        if self.q1 is None:
            return None
        return self.q1[0]

    def empty(self):
        """
        :rtype: bool
        """
        if self.q1:
            return False
        return True
