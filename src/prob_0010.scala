/**
  * Summation of primes: https://projecteuler.net/problem=10
  */

def isPrime(n: Int) = (2 to math.sqrt(n).toInt).forall(n%_ != 0)

val answer = (2 to 2000000).toStream.filter(isPrime).sum