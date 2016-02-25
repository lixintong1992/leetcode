# 326. Power of Three


class Solution(object):
    def isPowerOfThree(self, n):
        """
        :type n: int
        :rtype: bool
        """
        return ((n > 0) and (1162261467 % n == 0))

# 输入是int，正数范围是0-2^31
# 在此范围中允许的最大的3的次方数为3^19=1162261467
