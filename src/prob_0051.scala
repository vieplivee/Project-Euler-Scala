/**
  * Self powers: https://projecteuler.net/problem=48
  */

import scala.math

def selfPow10Dig(n: Int): Long = {
	var result = 1L
	for (x <- (1 to n)) {
		result = (result * n).toString.takeRight(10).toLong
	}
	result
}

def sum10Dig(m: Long, n: Long) = (m + n).toString.takeRight(10).toLong

def getSum(n: Int) = (1 to n).map(x => selfPow10Dig(x)).reduceLeft((x, y) => sum10Dig(x, y))

val answer = getSum(1000)