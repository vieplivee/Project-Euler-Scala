/**
  * Highly divisible triangular number: https://projecteuler.net/problem=12
  */

def numDivisors(n: BigInt) = (BigInt(1) to n).filter(n%_ == 0).size
def getTriangle(n: Int) = BigInt((1 to n).sum)
val answer = Stream.from(1).toIterator.find(x => numDivisors(getTriangle(x)) > 500)