/**
  * Digit fifth powers: https://projecteuler.net/problem=30
  */

import scala.math

def isFifthQualify(n: Int) = {
	n == {
		n.toString.split("").toVector.
		  map(x => math.pow(x.toInt, 5).toInt).
		  sum
	} && n > 1
}

val answer = (1 to 1000000).filter(isFifthQualify(_)).sum