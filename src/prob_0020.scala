/**
  * Factorial digit sum: https://projecteuler.net/problem=20
  */

def fact(n: Int) = (1 to n).foldLeft(BigInt(1)){_ * _}
def sumDigitsFact(n: Int) = fact(n).toString.split("").map(_.toInt).sum

val answer = sumDigitsFact(100)