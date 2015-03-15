/**
  * Multiples of 3 and 5: https://projecteuler.net/problem=1
  */

val answer = 1.until(1000).filter(x => (x % 3 == 0 || x % 5 == 0)).sum