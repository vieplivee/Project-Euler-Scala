/**
  * 10001st prime: https://projecteuler.net/problem=7
  */

def isPrime(n: Int) = (2 to math.sqrt(n).toInt).forall(n%_ != 0)
val answer = (2 to 10000000).filter(isPrime).zipWithIndex.filter(_._2 == 10000).map(x => x._1)