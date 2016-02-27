# 290. Word Pattern
class Solution(object):
    def wordPattern(self, pattern, str):
        """
        :type pattern: str
        :type str: str
        :rtype: bool
        """
        b = {}
        a = str.split(' ')
        if len(a) != len(pattern):
            return False
        for i in xrange(len(pattern)):
            if pattern[i] in b:
                if b[pattern[i]] == a[i]:
                    pass
                else:
                    return False
            else:
                b[pattern[i]] = a[i]
        b = {}
        for i in xrange(len(a)):
            if a[i] in b:
                if b[a[i]] == pattern[i]:
                    pass
                else:
                    return False
            else:
                b[a[i]] = pattern[i]
        return True
