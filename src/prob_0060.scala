/**
  * Prime pair sets: https://projecteuler.net/problem=60
  */

val example = Set(3, 7, 109, 673)

def isPrime(n: Int) = (2 to math.sqrt(n).toInt).forall(n%_ != 0) && n > 1
def isPrimePair(m: Int)(n: Int) = {
	isPrime(m) && isPrime (n) &&
	  (isPrime(List(m, n).map(_.toString).foldLeft("")(_ + _).toInt)) &&
	  (isPrime(List(m, n).reverse.map(_.toString).foldLeft("")(_ + _).toInt))
}
def isPrimeExisting4(m: Int) = {
	isPrimePair(3)(m) &&
	  isPrimePair(7)(m) &&
	  isPrimePair(109)(m) &&
	  isPrimePair(673)(m)
}

val answer = (674 to 100000000).find(isPrimeExisting4).get