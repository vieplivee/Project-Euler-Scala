/**
  * Pandigital products: https://projecteuler.net/problem=32
  */

val digits = "123456789".toSet
def isPandigital(n:Int) = {	
	(1 to 99).
	  filter(n%_ == 0).
	  find(x => {
	  	val concat = x.toString ++ (n/x).toString ++ n.toString
	  	val concatSet = concat.toSet
	  	concat.size == 9 && concatSet == digits
	  }).
	  nonEmpty
}

val answer = (1234 to 9876).filter(isPandigital(_)).sum