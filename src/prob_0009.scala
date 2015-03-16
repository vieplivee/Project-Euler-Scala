/**
  * Largest product in a series: https://projecteuler.net/problem=9
  */

import scala.math

def square(n: Int) = math.pow(n, 2)

val n = 1000

for (
  i <- 1 until n;
	j <- 1 until n;
	k <- 1 until n) {
	if (square(i) + square(j) == square(k) &&
		i + j + k == n) {
		println(i * j * k)
	}
}
