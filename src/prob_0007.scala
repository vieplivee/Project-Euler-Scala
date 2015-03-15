/**
  * 10001st prime: https://projecteuler.net/problem=7
  *
  * By listing the first six prime numbers: 
  * 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
  *
  * What is the 10001st prime number?
  */

def isPrime(n: Int) = (2 to math.sqrt(n).toInt).forall(n%_ != 0)

val primes = (2 to 10000000).filter(isPrime)
val index = 1 to primes.length
val answer = primes.zip(index).filter(_._2 == 10001).map(x => x._1)