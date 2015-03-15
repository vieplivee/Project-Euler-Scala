import scala.math

def square(n: Int) = math.pow(n, 2)


// the int version of is prime
def isPrime(n: Int) = (2 to math.sqrt(n).toInt).forall(n%_ != 0)

// the long version of is prime
def isPrime(n: Long) = (2L to math.sqrt(n).toLong).forall(n%_ != 0)

// sum digits
def sumDigit(l: Long): Int = l.toString.map(_.asDigit).sum

// get full digits of a huge number

val power = 100
val base = 2

def getPower(base: Int, power: Int) = {
	var result = BigInt(1)
	var i = power
	while (i >= 0) {
		result = result * 2
		i = i - 1
	}
	result
}