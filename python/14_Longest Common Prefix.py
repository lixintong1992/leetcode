# 14. Longest Common Prefix
class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if len(strs) == 0:
            return ''

        s = strs[0]
        for i in strs[1:]:
            if len(i) < len(s):
                s = s[:len(i)]
            for j in xrange(min(len(s), len(i))):
                if s[j] != i[j]:
                    s = s[:j]
                    break
            if s == '':
                return ''
        return s
