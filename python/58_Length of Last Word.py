# 58. Length of Last Word
class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        # if s == '':
        #     return 0
        # s = s.strip()
        # s = s.split(' ')
        # try:
        #     return len(s[-1])
        # except Exception:
        #     return 0
        return len(s.rstrip(' ').split(' ')[-1])
