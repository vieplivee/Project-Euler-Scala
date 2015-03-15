/**
  * Longest Collatz sequence: https://projecteuler.net/problem=15
  */

// set up grids
val length = 2
val width = 2

class GetPosition {
	case class Position (x: Int, y: Int) {
		def isLegit = {x >= 0 && y >= 0}
	}

	private var current: Position = Position(length, width)
	def currentPosition: Position = current

	def move(m: String) {
	  m match {
	  	case "down" => current = Position(current.x, current.y - 1)
	  	case "right" => current = Position(current.x - 1, current.y)
	  	case _ => println("no such move!!!")
	  }
	  if (!current.isLegit) println("out of bound error!!!")
	}
}



val p = new Positions()
p.currentPosition
p moveDown
p.currentPosition