# 70. Climbing Stairs
class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        # if n <= 0:
        #     return 0
        # if n == 1:
        #     return 1
        # if n == 2:
        #     return 2

        # n1 = 1
        # n2 = 2
        # for i in xrange(2, n):
        #     all = n1 + n2
        #     n1 = n2
        #     n2 = all
        # return all
        a = b = 1
        for _ in range(n):
            a, b = b, a + b
        return a
