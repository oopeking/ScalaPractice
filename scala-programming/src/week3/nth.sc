package week3

import week3._

object nth {

  def nth[T](n: Int, list: List[T]): T = {
    if (n == 0) list.head
    else nth(n - 1, list.tail)
  }                                               //> nth: [T](n: Int, list: week3.List[T])T
}