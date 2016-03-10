# 191. Number of 1 Bits
class Solution(object):
    def hammingWeight(self, n):
        """
        :type n: int
        :rtype: int
        """
        count = 0
        if n == 0:
            return 0
        while n > 1:
            if n % 2 == 1:
                count += 1
            n = n / 2
        if n == 1:
            count += 1

        return count
