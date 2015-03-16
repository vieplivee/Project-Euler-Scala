/**
  * Lattice paths: https://projecteuler.net/problem=15
  */

// doesn't work
def numPaths(x: Int, y: Int): Int = (x, y) match {
	case (0, n) if (n >= 1) => 1
	case (m, 0) if (m >= 1) => 1
	case (m, n) if (m >= 1 && n >= 1) => {
		numPaths(m - 1, n) + numPaths(m, n - 1)
	}
}
val answer = numPaths(20, 20)

// try factorial - it's kind of cheating though
def fact(n: Int) = (1 to n).foldLeft(BigInt(1)){_ * _}
val answer = fact(40)/fact(20)/fact(20)