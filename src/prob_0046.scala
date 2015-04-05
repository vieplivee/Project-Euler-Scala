/**
  * Goldbach's other conjecture: https://projecteuler.net/problem=46
  */


def isPrime(n: Int) = (2 to math.sqrt(n).toInt).forall(n%_ != 0)
def isSquare(n: Int) = {
	val x = math.sqrt(n).toInt
	n == x * x || n == (x + 1) * (x + 1)
}
def isGold(n: Int) = {
	(2 to n - 2).filter(x => isPrime(x)).map(x => (n - x)/2).filter(isSquare).nonEmpty
}

val answer = Stream.from(1).map(2 * _ - 1).filter(x => !isPrime(x)).find(x => !isGold(x)).get