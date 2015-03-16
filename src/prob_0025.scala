/**
  * 1000-digit Fibonacci number: https://projecteuler.net/problem=25
  */

import scala.collection.mutable.Map

var fibSeq = Map(1 -> 1, 2 -> 2)
val minSize = 1000

def fib(n: Int): Int = n match {
	case x if (fibSeq.keys.toSet.contains(x)) => fibSeq(x)
	case y if (!fibSeq.keys.toSet.contains(y)) => {
		val newVal = fib(y - 1) + fib(y - 2)
		fibSeq += (y -> newVal)
		newVal
	}
}
def fibLength(n: Int) = {
	fib(n).toString.size
}
def isFibLong(n: Int) = {
	fib(n).toString.size == minSize
}

val answer = (1 to Int.MaxValue).toStream.filter(isFibLong).head