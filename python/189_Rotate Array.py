# 189. Rotate Array
class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        while k > 0:
            nums.insert(0, nums.pop())
            k -= 1
