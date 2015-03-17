/**
  * 1000-digit Fibonacci number: https://projecteuler.net/problem=25
  */

def fibFrom(a: BigInt, b: BigInt): Stream[BigInt] = a #:: fibFrom(b, a + b)
val answer = fibFrom(1, 1).toIterator.zipWithIndex.find(_._1.toString.size >= 1000).map(_._2)