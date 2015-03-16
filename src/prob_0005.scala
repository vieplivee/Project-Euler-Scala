/**
  * Smallest multiple: https://projecteuler.net/problem=5
  */

def isNotDivisable(n: Int) = (1 to 20).exists(n%_ != 0)
val answer = (1 until Int.MaxValue).toStream.filterNot(isNotDivisable).head