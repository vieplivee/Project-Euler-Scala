/**
  * Largest prime factor: https://projecteuler.net/problem=3
  */

import scala.math._

def isPrime(n: Int) = (2 to math.sqrt(n).toInt).forall(n%_ != 0)

val n = 600851475143L
val answer = 1.to(sqrt(n).toInt).filter(isPrime).filter(n % _ == 0).sortWith(_ > _).head