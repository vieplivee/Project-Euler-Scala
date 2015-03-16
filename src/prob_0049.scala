/**
  * Prime permutations: https://projecteuler.net/problem=49
  */

import scala.collection.mutable.ArrayBuffer
import scala.math.abs

def isPrime(n: Int) = (2 to math.sqrt(n).toInt).forall(n%_ != 0)
def sortDigit(n: Int) = n.toString.toList.sortWith(_ < _).mkString.toInt

def isSingleDistances(v: Set[Int]) = {
  var result = ArrayBuffer(0)
  for (i <- v; j <- v if i < j) {
    result ++= ArrayBuffer(j - i)
  }
  result.groupBy(identity).mapValues(_.size).filter(_._2 > 1).isEmpty
}

val answer = (1000 to 9999).filter(isPrime).groupBy(sortDigit(_)).
  map(_._2.toSet).filter(_.size >= 3).flatMap(_.subsets.toList).filter(_.size == 3).
  filterNot(x => isSingleDistances(x)).tail.map(_.mkString(""))