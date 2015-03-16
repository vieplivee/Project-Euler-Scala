/**
  * Sum square difference: https://projecteuler.net/problem=6
  */

import scala.math

def square(n:Int) = math.pow(n, 2).toInt

val nlist = 1 to 100
val answer = math.abs(nlist.map(square).sum - square(nlist.sum))