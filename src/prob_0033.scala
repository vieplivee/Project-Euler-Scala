/**
  * Digit cancelling fractions: https://projecteuler.net/problem=33
  */

def gcd(m: Int, n: Int): Int = {
	if (m > n) gcd(n, m)
	else if (m == 1) 1
	else if (n%m == 0) m
	else gcd(n - m * (n/m), m)
}

val all = (10 to 99).map(_.toString)
val pairs = for {
	i <- 0 until all.size - 1; j <- i + 1 to all.size - 1
	numi = all(i); numj = all(j)
	int = numi.split("").intersect(numj.split(""))
	if (int.nonEmpty && int(0) != "0")
} yield {
	val intfirst = int(0)
	val numi_left = numi.replaceFirst(intfirst, "").toInt
	val numj_left = numj.replaceFirst(intfirst, "").toInt
	val check = numi.toInt * numj_left == numi_left * numj.toInt
	(numi, numj, check)
}
val rawanswer = pairs.filter(_._3 == true).map(x => (x._1.toInt, x._2.toInt)).foldLeft((1, 1)){
	(a, b) => (a._1 * b._1, a._2 * b._2)
}
val answer = rawanswer._2 / gcd(rawanswer._1, rawanswer._2)