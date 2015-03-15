/**
  * Highly divisible triangular number: https://projecteuler.net/problem=12
  */

def numDivisors(n: Int) = {
	var result = 0
	for (i <- 1 until n) {
		if (n % i == 0) result += 1
	}
	result
}

val answer = (1 to 1000000).toStream.map(x => (1 to x).sum).map(x => (x, numDivisors(x))).
  filter(_._2 >= 500).map(_._1)