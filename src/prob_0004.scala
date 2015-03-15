/**
  * Largest palindrome product: https://projecteuler.net/problem=4
  */

val allnum = 100 to 999
val allprod = for (x <- allnum; y <- allnum) yield {(x, y, x * y)}
val answer = allprod.
  filter(x => (x._3 == x._3.toString.reverse.toInt)).
  sortWith(_._3 > _._3).head
