/**
  * Largest product in a series: https://projecteuler.net/problem=8
  *
  * The four adjacent digits in the 1000-digit number that have the 
  * greatest product are 9 × 9 × 8 × 9 = 5832.
  *
  * Find the thirteen adjacent digits in the 1000-digit number that 
  * have the greatest product. What is the value of this product?
  * What is the 10001st prime number?
  */

var digits:String = """73167176531330624919225119674426574742355349194934
96983520312774506326239578318016984801869478851843
85861560789112949495459501737958331952853208805511
12540698747158523863050715693290963295227443043557
66896648950445244523161731856403098711121722383113
62229893423380308135336276614282806444486645238749
30358907296290491560440772390713810515859307960866
70172427121883998797908792274921901699720888093776
65727333001053367881220235421809751254540594752243
52584907711670556013604839586446706324415722155397
53697817977846174064955149290862569321978468622482
83972241375657056057490261407972968652414535100474
82166370484403199890008895243450658541227588666881
16427171479924442928230863465674813919123162824586
17866458359124566529476545682848912883142607690042
24219022671055626321111109370544217506941658960408
07198403850962455444362981230987879927244284909188
84580156166097919133875499200524063689912560717606
05886116467109405077541002256983155200055935729725
71636269561882670428252483600823257530420752963450"""

digits = digits.replace("\n", "")

val ints = digits.split("").map(_.toLong).toList
val ints1 = (0L :: ints).dropRight(1)
val ints2 = (0L :: ints1).dropRight(1)
val ints3 = (0L :: ints2).dropRight(1)
val ints4 = (0L :: ints3).dropRight(1)
val ints5 = (0L :: ints4).dropRight(1)
val ints6 = (0L :: ints5).dropRight(1)
val ints7 = (0L :: ints6).dropRight(1)
val ints8 = (0L :: ints7).dropRight(1)
val ints9 = (0L :: ints8).dropRight(1)
val ints10 = (0L :: ints9).dropRight(1)
val ints11 = (0L :: ints10).dropRight(1)
val ints12 = (0L :: ints11).dropRight(1)

val prod0 = ints
val prod1 = prod0.zip(ints1).map(x => x._1 * x._2)
val prod2 = prod1.zip(ints2).map(x => x._1 * x._2)
val prod3 = prod2.zip(ints3).map(x => x._1 * x._2)
val prod4 = prod3.zip(ints4).map(x => x._1 * x._2)
val prod5 = prod4.zip(ints5).map(x => x._1 * x._2)
val prod6 = prod5.zip(ints6).map(x => x._1 * x._2)
val prod7 = prod6.zip(ints7).map(x => x._1 * x._2)
val prod8 = prod7.zip(ints8).map(x => x._1 * x._2)
val prod9 = prod8.zip(ints9).map(x => x._1 * x._2)
val prod10 = prod9.zip(ints10).map(x => x._1 * x._2)
val prod11 = prod10.zip(ints11).map(x => x._1 * x._2)
val prod12 = prod11.zip(ints12).map(x => x._1 * x._2)

val answer = prod3.sortWith(_ > _).head
val answer = prod12.sortWith(_ > _).head