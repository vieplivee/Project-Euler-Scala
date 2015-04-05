/**
  * Prime pair sets: https://projecteuler.net/problem=60
  */

def isPrime(n: Long) = (2L to math.sqrt(n).toLong).forall(n%_ != 0) && n > 1
val primes = (1L to 10000L).filter(isPrime)
val primePairs = (
	for {
  	i <- 0 until primes.size - 1; j <- i until primes.size
  	pi = primes(i); pj = primes(j)
  	if (isPrime((pi.toString + pj).toLong) &&
  		  isPrime((pj.toString + pi).toLong))
  } yield (pi, pj)
 ).toSet

def isPrime2All(pset: List[Long], p: Long) =
  pset.foldLeft(true)((b, a) => b && primePairs((a, p)))

def getAll(pset: List[Long], plist: List[Long]): Option[List[Long]] = {
  if (pset.size == 5) Some(pset)
  else if (plist.isEmpty) None
  else if (!isPrime2All(pset, plist.head)) getAll(pset, plist.tail)
  else getAll(plist.head :: pset, plist.tail).orElse(getAll(pset, plist.tail))
}

def answer = getAll(Nil, primes.toList).get.sum