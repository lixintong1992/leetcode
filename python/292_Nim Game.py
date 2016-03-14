# 292. Nim Game


class Solution(object):
    def canWinNim(self, n):
        """
        :type n: int
        :rtype: bool
        """
        # a = n%4
        # if a == 0:
        #     return False
        # return True
        return bool(n % 4)
