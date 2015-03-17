/**
  * Reciprocal cycles: https://projecteuler.net/problem=26
  */

import scala.math
def isPrime(n: Int) = (2 to math.sqrt(n).toInt).forall(n%_ != 0) && n > 1
def hasNoneTwoFivePrimeFactor(n: Int) = {
	(isPrime(n) && (n != 2) && (n != 5)) ||
  ((2 to math.sqrt(n).toInt).
  filter(isPrime).filterNot(x => (x == 2 || x == 5)).
  exists(n%_ == 0))
}

def recip(n: Int) = BigDecimal(1) / BigDecimal(n)
def recipStringArray(n: Int) = recip(n).toString.replace("0.", "").split("")

def getCycleLength(a: Array[String])

(2 to 1000).filter(hasNoneTwoFivePrimeFactor).map(recip)
(2 to 1000).filter(hasNoneTwoFivePrimeFactor).map(recipStringArray)
