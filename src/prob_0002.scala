/**
  * Even Fibonacci numbers: https://projecteuler.net/problem=2
  */

import scala.collection.mutable.ListBuffer

val n = 4000000
var newElement = 0
val fibList = ListBuffer(1,2)
while (newElement <= n) {
	val a = fibList.length
	newElement = fibList(a - 1) + fibList(a - 2)
	if (newElement <= n) fibList.append(newElement)
}

val answer = fibList.filter(_ % 2 == 0).sum
