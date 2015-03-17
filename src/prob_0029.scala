/**
  * Distinct powers: https://projecteuler.net/problem=29
  */

val range = (2 to 100)

def power(a: Int, b: Int):BigInt = {
	var result = BigInt(1)
	var i = 0
	while (i < b) {
		result = result * a
		i = i + 1
	}
	result
}

def powers(a: Int) = range.map(x => power(a, x)).toSet
val answer = range.flatMap(x => powers(x)).toSet.size