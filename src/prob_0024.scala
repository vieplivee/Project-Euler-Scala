/**
  * Lexicographic permutations: https://projecteuler.net/problem=24
  */

import scala.collection.mutable.ArrayBuffer

def fact(n: Int) = (1 to n).foldLeft(BigInt(1)){_ * _}
def getSequence(n: Int, initial: BigInt): String = {
	var result = ""
	var init = initial - 1
	var numSeq = (0 to 9).map(_.toString).toBuffer
	for (i <- 0 to n) {
		val j = n - i
		val div = init / fact(j)
		val x = numSeq(div.toInt)
		numSeq = numSeq.filter(_ != x)
		result += x.toString
		init = init - div * fact(j)
	}
	result
}

val answer = getSequence(9, 1000000)