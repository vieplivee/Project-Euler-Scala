/**

  * Largest product in a series: https://projecteuler.net/problem=9
  *
  * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
  * a2 + b2 = c2
  *
  * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
  * Find the product abc.
  */

import scala.math

def square(n: Int) = math.pow(n, 2)

val n = 1000

for (i <- 1 until n;
	 j <- 1 until n;
	 k <- 1 until n) {
	if (square(i) + square(j) == square(k) &&
		i + j + k == n) {
		println(i * j * k)
	}
}
