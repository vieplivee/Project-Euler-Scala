/**
  * Amicable numbers: https://projecteuler.net/problem=21
  */

def sumDivisors(n: Int): Int = (1 until n).filter(n%_ == 0).sum
def isAmicable(n: Int) = {(n != sumDivisors(n)) && (n == sumDivisors(sumDivisors(n)))}
val answer = (1 until 10000).filter(isAmicable).sum