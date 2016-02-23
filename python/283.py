# 283. Move Zeroes


class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """

        for i in xrange(len(nums)-1):
            if nums[i] != 0:
                continue

            for j in xrange(i+1, len(nums)):
                if nums[j] == 0:
                    continue
                else:
                    break

            nums[i] = nums[j]
            nums[j] = 0
        # nums.sort(key= lambda x: 1 if x == 0 else 0)
