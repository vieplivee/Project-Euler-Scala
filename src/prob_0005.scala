/**
  * Smallest multiple: https://projecteuler.net/problem=5
  *
  * 2520 is the smallest number that can be divided by each 
  * of the numbers from 1 to 10 without any remainder.
  *
  * What is the smallest positive number that is evenly divisible
  * by all of the numbers from 1 to 20?
  */


val divisors = 1 to 20
val answer = (1L until 10000000000L).toStream.filter(x => {
	var result = true
	for (d <- divisors) {result = (result && x % d == 0)}
	result
	})