# 135. Candy


class Solution(object):
    def candy(self, ratings):
        """
        :type ratings: List[int]
        :rtype: int
        """
        sum_temp = [1] * len(ratings)

        for i in xrange(1, len(ratings)):
            if ratings[i] > ratings[i-1]:
                sum_temp[i] = sum_temp[i-1] + 1

        for i in xrange(1, len(ratings)):
            if ratings[len(ratings)-i-1] > ratings[len(ratings)-i]:
                sum_temp[len(ratings)-i-1] = max(sum_temp[len(ratings)-i] + 1, sum_temp[len(ratings)-i-1])

        return sum(sum_temp)
