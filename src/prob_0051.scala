/**
  * Prime digit replacements: https://projecteuler.net/problem=51
  */

import scala.math

val minCount = 8

def isPrime(n: Int) = (2 to math.sqrt(n).toInt).forall(n%_ != 0)
def getPrimeStrings(max: Int) = (1 to max).filter(isPrime).map(_.toString)
def countPrimes(p: String)(d: Char) = {
  "0123456789".toList.
    map(x => p.replace(d, x)).
    filter(!_.startsWith("0")).
    map(Integer.parseInt).
    filter(isPrime).
    length
}
def maxCount(prime: String) = prime.toSet.map(countPrimes(prime)).max
def answer = getPrimeStrings(10000000).find(maxCount(_) >= minCount).get

println(answer)