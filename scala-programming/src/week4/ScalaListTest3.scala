package week4

object ScalaListTest3 extends App {
  println("chao")
}

class ScalaListTest3 {
  def times(chars: List[Char]): List[(Char, Int)] = chars match {
    case List() => List()
    case h :: t => (h, 1) :: times(t)
  }

  def addTimes(list: List[(Char, Int)]): List[(Char, Int)] = ('a', 1) :: List()

  times("acadcbbb".toList)

}