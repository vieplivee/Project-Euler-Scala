/**
  * Power digit sum: https://projecteuler.net/problem=16
  */

val power = 100
val base = 2

def getPower(base: Int, power: Int) = {
	var result = BigInt(1)
	var i = power
	while (i >= 1) {
		result = result * 2
		i = i - 1
	}
	result
}

val answer = getPower(2, 1000).toString.map(_.asDigit).sum