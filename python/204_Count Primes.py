# 204. Count Primes
class Solution(object):
    def countPrimes(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n < 3:
            return 0
        primes = [True] * n
        primes[0] = primes[1] = False
        for i in xrange(2, int(n ** 0.5) + 1):
            if primes[i]:
                primes[i * i: n: i] = [False] * len(primes[i * i: n: i])
        return sum(primes)
# 判断一个数是否是质数，只需判断它是否能被小于它开跟后后的所有数整除，
# 这样做的运算就会少了很多，因此效率也高了很多。

# 求的第一个质数（在此是2），然后将是2的倍数的数全置为false（2除外），即2、4、6、8……位置上置为false。
# 然后是3的倍数的全置为false（3除外），一直到14（14是200的开平方），这样的话把不是质数的位置上置为false了，
# 剩下的全是质数了，挑着是true的打印出来就行了。
