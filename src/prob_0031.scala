/**
  * Coin sums: https://projecteuler.net/problem=31
  */

var i = 0
for {
	x1 <- 0 to 200;
	x2 <- 0 to 100;
	x5 <- 0 to 40;
	x10 <- 0 to 20;
	x20 <- 0 to 10;
	x50 <- 0 to 4;
	x100 <- 0 to 2;
	x200 <- 0 to 1
	if (x1 + x2 * 2 + x5 * 5 + x10 * 10 + x20 * 20 + x50 * 50 + x100 * 100 + x200 * 200 == 200)
	} {
	// println((x1, x2, x5, x10, x20, x50, x100, x200))
	i += 1
}

val answer = i