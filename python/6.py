# 6. ZigZag Conversion


class Solution(object):
    def convert(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        if numRows <= 1:
            return s
        cycle, slen, res = numRows*2 - 2, len(s), ""
        for i in xrange(numRows):
            for j in xrange(i, slen, cycle):
                res += s[j]
                secondJ = (j - i) + cycle - i
                if (secondJ-j) % cycle != 0 and secondJ < slen:
                    res += s[secondJ]
        return res
