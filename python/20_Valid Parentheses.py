# 20. Valid Parentheses
class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        left = []
        for i in s:
            if i == '{':
                left.append(3)
            if i == '[':
                left.append(2)
            if i == '(':
                left.append(1)
            if i == ')':
                if len(left) == 0 or left.pop() != 1:
                    return False
            if i == ']':
                if len(left) == 0 or left.pop() != 2:
                    return False
            if i == '}':
                if len(left) == 0 or left.pop() != 3:
                    return False
        if len(left) == 0:
            return True
        else:
            return False
