/**
  * Prime digit replacements: https://projecteuler.net/problem=51
  */

import scala.math

def isPrime(n: Int) = (2 to math.sqrt(n).toInt).forall(n%_ != 0)
def getPrimeStrings(max: Int) = (1 to max).filter(isPrime).map(_.toString)
def maxCount(prime: String) = prime.toSet.map{
	d:Char =>
		"0123456789".toList.
	    map(x => prime.replace(d, x)).
	    filter(!_.startsWith("0")).
	    map(_.toInt).
	    filter(isPrime).
	    length
}.max
def answer = getPrimeStrings(Int.MaxValue).find(maxCount(_) >= 8).get