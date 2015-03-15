/**

  * Summation of primes: https://projecteuler.net/problem=10
  *
  * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
  *
  * Find the sum of all the primes below two million.
  */

def isPrime(n: Int) = (2 to math.sqrt(n).toInt).forall(n%_ != 0)

// val n = 10
val n = 2000000
val answer = (2 to n).toStream.filter(isPrime).sum