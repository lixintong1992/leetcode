# 169. Majority Element
class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # sum = {}
        # n = len(nums)/2
        # for i in nums:
        #     if i in sum:
        #         sum[i] += 1
        #     else:
        #         sum[i] = 1
        #     if sum[i] > n:
        #         return i

        major = nums[0]
        count = 1
        for i in xrange(1, len(nums)):
            if count == 0:
                count += 1
                major = nums[i]
            elif major == nums[i]:
                count += 1
            else:
                count -= 1
        return major
