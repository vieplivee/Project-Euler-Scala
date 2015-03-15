def isPrime(n: Int) = (2 to math.sqrt(n).toInt).forall(n%_ != 0)
def sortDigit(n: Int) = n.toString.toList.sortWith(_ < _).mkString.toInt
def getDistence(List[Int]) = {
	
}


(1000 to 9999).filter(isPrime).groupBy(sortDigit(_)).filter(_._2.size >= 3).
  map(x => {
  	val alist = x._2
  	val n 
  })

  map(_._2.unzip._2.sortWith(_>_)).
  take(1)

primeZipKey.groupBy(_._1).filter(_._2.length == 3).
  map(_._2.unzip._2).map(x => isEqualDistance(x(0), x(1), x(2), x(3)))
  filter(
  	x => {
  	  val n1 = x(0)
  	  val n2 = x(1)
  	  val n3 = x(2)
  	  isEqualDistance(n1, n2, n3)
  	}).
  map(_.unzip._2).
  filter(x => isEqualDistance(x._2))


object Euler049 extends EulerApp {
  def sort (n :Int) = n.toString.toList.sortWith(_<_).mkString.toInt
  def ismem (n :Int, nn :Int) = isprime(nn) && sort(nn) == sort(n)
  def isseq (n :Int) = ismem(n, n+3330) && ismem(n, n+6660)
  def mkseq (n :Int) = List(n, n+3330, n+6660).mkString(",")
  def answer = mkseq(1488.to(10000-6660).filter(isprime).filter(isseq).head)
}