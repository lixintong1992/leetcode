# 165. Compare Version Numbers
class Solution(object):
    def compareVersion(self, version1, version2):
        """
        :type version1: str
        :type version2: str
        :rtype: int
        """
        version1 = version1.split('.')
        version2 = version2.split('.')
        for i in xrange(min(len(version1), len(version2))):
            if int(version1[i]) > int(version2[i]):
                return 1
            elif int(version1[i]) < int(version2[i]):
                return -1
        if len(version1) == len(version2):
            return 0
        print 123
        if len(version1) > len(version2):
            for j in xrange(i+1, len(version1)):
                if int(version1[j]) != 0:
                    return 1
        print 456
        if len(version1) < len(version2):
            for j in xrange(i+1, len(version2)):
                if int(version2[j]) != 0:
                    return -1
        return 0
