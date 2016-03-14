# 1. Two Sum


class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        # for i in xrange(len(nums)):
        #     for j in xrange(i+1,len(nums)):
        #         if nums[i]+nums[j] == target:
        #             return [i,j]

        # for i in xrange(len(nums)):
        #     les = target-nums[i]
        #     if les in nums:
        #         if nums.count(les)>1:
        #             nums.remove(les)
        #             j = nums.index(les)+1
        #             return [i,j]
        #         elif les == nums[i]:
        #             continue
        #         else:
        #             j = nums.index(les)
        #             return [i,j]

        if len(nums) <= 1:
            return False
        buff_dict = {}
        for i in range(len(nums)):
            if nums[i] in buff_dict:
                return [buff_dict[nums[i]], i]
            else:
                buff_dict[target - nums[i]] = i
