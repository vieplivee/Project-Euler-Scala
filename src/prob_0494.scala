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
def prefixSize(a: BigInt) = fullSeq(a).toIterator.zipWithIndex.find(x => isPowerOf2(x._1)).map(_._2).get
def prefixSeq(a: BigInt, n: Int) = fullSeq(a).take(n).toVector
def getPermPattern(v: Vector[BigInt]) = {
	val mapping = v.sortWith(_ < _).zipWithIndex.map(x => (x._1, x._2 + 1)).toMap
	v.map(mapping)
}
def prefixPerm(a: BigInt, n: Int) = getPermPattern(prefixSeq(a, n))

def getAnswer(all: Long, n: Int) = (BigInt(1) to BigInt(all)).toStream.filter(prefixSize(_) == n).map(x => prefixPerm(x, n)).toSet.size

def getPerms(all: Long, n: Int) = {
	(BigInt(1) to BigInt(all)).toStream.filter(prefixSize(_) == n).map(x => prefixPerm(x, n)).toSet
}

(BigInt(1) to BigInt(1000)).map(prefixSize(_))

val n = 5
(BigInt(1) to BigInt(1000)).toStream.filter(prefixSize(_) == n).map(x => prefixPerm(x, n)).toSet

// testing

(BigInt(1) to BigInt(10000000)).toStream.map{x =>
	(prefixSize(x) == 10) match {
		case true => prefixPerm(x, 10)
		case false => None
	}}.toSet.size


def lengthColatz(n: BigInt):BigInt = n match {
	case n if isPowerOf2(n) => 0
	case n if (n%2 == 0 && !(isPowerOf2(n))) => lengthColatz(n / 2) + 1
	case n if n%2 == 1 => lengthColatzLong(3 * n + 1) + 1
}


(BigInt(1) to BigInt(10000000)).toStream.
  filter(prefixSize(_) == 10).
  map(x => prefixPerm(x, 10)).
  toSet.size


getAnswer(1000L, 5) // good enough
getAnswer(1000000L, 10) // not good enough


getAnswer(Int.MaxValue.toLong, 20)

getAnswer(100000000, 20)


val answer = getAnswer(Int.MaxValue.toLong, 90)


val n = 10
(BigInt(1) to BigInt(100000)).toStream.filter(prefixSize(_) == n).map(x => prefixPerm(x, n)).toSet.foreach(println)

/****/

val init = (1 to 100).map(x => math.pow(2, x).toLong)
val step1 = init.filter(x => (x - 1)%3 == 0).map(x => (x, (x - 1)/3)).filter(x => x._2 != 1)
val step2 = step1.map(x => (x._1, x._2, x._2 * 2))
val step31 = step2.filter(x => (x._3 - 1)%3 == 0).map(x => (x._1, x._2, x._3, (x._3 - 1)/3)).filter(x => x._4 != 1)
val step32 = step2.map(x => (x._1, x._2, x._3, x._3 * 2))


case class Seq(first: BigInt, last: BigInt) {def sum(x: Seq) = x.first + x.last}
def getSequence(x: Seq): Stream[Seq] = x #:: getSequence(Seq(x.first + x.last, x.first))
def getAnswer(n: Int) = getSequence(Seq(0, 1)).take(n).last

