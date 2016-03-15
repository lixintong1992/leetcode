# 205. Isomorphic Strings
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t):
            return False
        temp = {}
        for i in xrange(len(s)):
            if s[i] not in temp:
                temp[s[i]] = t[i]
            else:
                if temp[s[i]] != t[i]:
                    return False
        temp = {}
        for i in xrange(len(t)):
            if t[i] not in temp:
                temp[t[i]] = s[i]
            else:
                if temp[t[i]] != s[i]:
                    return False
        return True
