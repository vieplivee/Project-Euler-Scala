/**
  * Prime digit replacements: https://projecteuler.net/problem=51
  */

import scala.math

def isPrime(n: Int) = (2 to math.sqrt(n).toInt).forall(n%_ != 0)

def getPrimeStrings(numDigits: Int) = (math.pow(10, numDigits - 1).toInt
		to (math.pow(10, numDigits) - 1).toInt).
	  filter(isPrime).map(_.toString)

def singleSearch(numDigits: Int, minCount: Int) = {
	val primeStrings = getPrimeStrings(numDigits)

	for (i <- (0 until numDigits)){
		val filtered = primeStrings.groupBy(x => x(i)).filter(_._2.size == minCount)
		if (filtered.size > 0) {
			val result = filtered.map(_._2.min).min
			println(s"Found $result at position: $i, within $numDigits digit numbers!")
		}
	}
}

// check answer
// singleSearch(2, 6)

def multiSearch(
	numDigits: Int,     // range of numbers to search
	minCount: Int,      // target: 8
	numPositions: Int   // positions where the digits are replaced
	) = {
	val primeStrings = getPrimeStrings(numDigits)

	for (i <- (0 until numDigits);
		   j <- (0 until numDigits)
		   if i != j){
		val filtered = primeStrings.
		  filter(x => (x(i) == x(j))).
		  groupBy(x => x(i)).
		  filter(_._2.size == minCount)
		if (filtered.size > 0) {
			val result = filtered.map(_._2.min).min
			println(s"Found $result at position: $i, within $numDigits digit numbers!")
		}
	}
}


def doubleSearch(
	numDigits: Int     // range of numbers to search
	,minCount: Int     // target: 8
	) = {
	val primeStrings = getPrimeStrings(numDigits)

	for (i <- (0 until numDigits);
		   j <- (0 until numDigits)
		   if i != j){
		
		val filtered = primeStrings.
		  filter(x => (x(i) == x(j))).
		  groupBy(x => x(i)).
		  filter(_._2.size == minCount)
		if (filtered.size > 0) {
			val result = filtered.map(_._2.min).min
			println(s"Found $result at position: $i, within $numDigits digit numbers!")
		}
	}
}

doubleSearch(5, 7)

for (i <- 1 to 10) singleSearch(i, 8) // not running