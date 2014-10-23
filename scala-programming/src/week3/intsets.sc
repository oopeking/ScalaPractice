package week3

object intsets {
  val head = new Empty incl 3                     //> head  : week3.IntSet = {.3.}
  head incl 5                                     //> res0: week3.IntSet = {.3{.5.}}
  head incl -4                                    //> res1: week3.IntSet = {{.-4.}3.}
}

//Binary search tree
abstract class IntSet {
  def contain(x: Int): Boolean
  def incl(x: Int): IntSet
}

class Empty extends IntSet {
  def contain(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)
  override def toString = "."
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contain(x: Int): Boolean = {
    if (x < elem) left contain x
    else if (x > elem) right contain x
    else true
  }
  def incl(x: Int): IntSet = {
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this
  }
  override def toString = "{" + left + elem + right + "}"
}