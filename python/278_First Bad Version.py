# 278. First Bad Version
# The isBadVersion API is already defined for you.
# @param version, an integer
# @return a bool
# def isBadVersion(version):


class Solution(object):
    def firstBadVersion(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n == 1:
            return 1
        front = n
        behind = 1
        while(1):
            temp = (front + behind) / 2
            if isBadVersion(temp):
                if temp == 1:
                    return 1
                if not isBadVersion(temp - 1):
                    return temp
                else:
                    front = temp
            else:
                if (front - behind) == 1:
                    return front
                behind = temp
