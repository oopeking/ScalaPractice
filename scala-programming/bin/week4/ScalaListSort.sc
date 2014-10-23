package week4

object ScalaListSort {
  val numList = List(1, 23, 4, -1, 678)

  def iSort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y :: ys => insert(y, iSort(ys))
  }

  def insert(y: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(y)
    case yy :: ys => if (y < yy) y :: xs else yy :: insert(y, ys)
  }

  //Seems the line should not put before the def of iSort and insert
  iSort(numList)
}