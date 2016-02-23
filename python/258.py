# 258. Add Digits


class Solution(object):
    def addDigits(self, num):
        """
        :type num: int
        :rtype: int
        """
        if num == 0:
            return 0

        else:
            a = num % 9
            return a if a != 0 else 9
