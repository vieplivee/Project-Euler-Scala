/**
  * Sum square difference: https://projecteuler.net/problem=6
  *
  * The sum of the squares of the first ten natural numbers is,
  * 12 + 22 + ... + 102 = 385
  *
  * The square of the sum of the first ten natural numbers is,
  * (1 + 2 + ... + 10)2 = 552 = 3025
  * 
  * Hence the difference between the sum of the squares of the 
  * first ten natural numbers and the square of the sum is
  * 3025 − 385 = 2640.
  *
  * Find the difference between the sum of the squares of the 
  * first one hundred natural numbers and the square of the sum.
  */

import scala.math

def square(n:Int) = math.pow(n, 2).toInt

val n = 100
val nlist = 1 to n
val answer = math.abs(nlist.map(square).sum - square(nlist.sum))