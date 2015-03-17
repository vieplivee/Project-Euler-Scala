/**
  * Quadratic primes: https://projecteuler.net/problem=27
  */

import scala.math

def isPrime(n: Int) = (2 to math.sqrt(n).toInt).forall(n%_ != 0) && n > 1
def firstNonePrime(a: Int)(b: Int) = {
	Stream.from(0).toIterator.
	  map(n => math.pow(n, 2).toInt + n * a + b).
	  zipWithIndex.
	  find(x => !isPrime(x._1)).map(_._2).get
}
def maxForA(a: Int) = {
	Range(-1000, 1000).map(x => firstNonePrime(a)(x)).max
}

val maxValue = Range(-1000, 1000).map(x => maxForA(x)).max
val a = Range(-1000, 1000).find(x => maxForA(x) == maxValue).get
val b = Range(-1000, 1000).find(x => firstNonePrime(a)(x) == maxValue).get

val answer = a * b

// testing
firstNonePrime(1)(41)
firstNonePrime(-79)(1601)
firstNonePrime(a)(b)