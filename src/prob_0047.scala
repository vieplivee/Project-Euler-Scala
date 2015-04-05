/**
  * Distinct primes factors: https://projecteuler.net/problem=47
  */



import scala.collection.mutable.Map

var pFactors = Map(2 -> Set(2), 3 -> Set(3))

def isPrime(n: Int) = (2 to math.sqrt(n).toInt).forall(n%_ != 0)

def setPrimeFactors(n: Int): Set[Int] = {
	if (!pFactors.contains(n)) {
		if (isPrime(n)) {
			pFactors += (n -> Set(n))
		} else {
			val x = (2 to math.sqrt(n).toInt).filter(x => isPrime(x)).find(n%_ == 0).get
			val setN = setPrimeFactors(n/x) + x
			if (!pFactors.contains(n)) {
				pFactors += (n -> setN)
			}
		}
	}
	pFactors(n)
}

def get2ConsFactors(n: Int) = {
	setPrimeFactors(n).size == 2 &&
	setPrimeFactors(n + 1).size == 2
}

def get3ConsFactors(n: Int) = {
	setPrimeFactors(n).size == 3 &&
	setPrimeFactors(n + 1).size == 3 &&
	setPrimeFactors(n + 2).size == 3
}

def get4ConsFactors(n: Int) = {
	setPrimeFactors(n).size == 4 &&
	setPrimeFactors(n + 1).size == 4 &&
	setPrimeFactors(n + 2).size == 4 &&
	setPrimeFactors(n + 3).size == 4
}

(1 to 1000).map(x => (x, get2ConsFactors(x))).filter(_._2).take(1)
(1 to 1000).map(x => (x, get3ConsFactors(x))).filter(_._2).take(1)

val answer = Stream.from(1).map(x => (x, get4ConsFactors(x))).find(_._2).get