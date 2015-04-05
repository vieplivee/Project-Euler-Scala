def gcd(m: Int, n: Int): Int = {
	if (m > n) gcd(n, m)
	else if (m == 1) 1
	else if (n%m == 0) m
	else gcd(n - m * (n/m), m)
}


def fibFrom(a: BigInt, b: BigInt): Stream[BigInt] = a #:: fibFrom(b, a + b)