/**
  * Longest Collatz sequence: https://projecteuler.net/problem=14
  */

def lengthColatzLong(n: Long):Long = n match {
case 1L => 1L
case n if n%2L == 0L => lengthColatzLong(n / 2) + 1
case n if n%2L == 1L => lengthColatzLong(3 * n + 1) + 1
}

val answer = (1L to 1000000L).map(x => (x, lengthColatzLong(x))).
  foldLeft((1L, 1L)){(x, y) => {
  	if (x._2 > y._2) x
  	else y
  }}