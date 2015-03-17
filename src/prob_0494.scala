/**
  * Collatz prefix families: https://projecteuler.net/problem=494
  */

def isPowerOf2(n: BigInt): Boolean = n match{
	case m if (m == BigInt(1)) => true
	case m if (m%2 == 0) => isPowerOf2(m/2)
	case m if (m%2 == 1) => false
}
def nextCollatz(n: BigInt) = n match{
	case m if (m%2 == 0) => m/2
	case m if (m%2 == 1) => 3 * m + 1
}
def fullSeq(a: BigInt): Stream[BigInt] = a #:: fullSeq(nextCollatz(a))
def stopAt(a: BigInt) = fullSeq(a).toIterator.zipWithIndex.find(x => isPowerOf2(x._1)).map(_._2).get
def prefixSeq(a: BigInt) = fullSeq(a).take(stopAt(a).toInt).toVector
def convertPerm(a: Vector[BigInt]) = {
	val b = a.zipWithIndex.sortWith(_._1 < _._1).unzip
	b._2
}
def getAnswer(all: Int, n: Int) = {
	(BigInt(1) to BigInt(all)).filter(prefixSeq(_).size == n).map(x => convertPerm(prefixSeq(x))).toSet.size
}

// testing
getAnswer(1000, 5)
getAnswer(10000000, 10)
getAnswer(100000000, 20)

val answer = getAnswer(Int.MaxValue, 90)