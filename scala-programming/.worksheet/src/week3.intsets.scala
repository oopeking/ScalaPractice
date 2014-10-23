package week3

object intsets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  val head = new Empty incl 3;System.out.println("""head  : week3.IntSet = """ + $show(head ));$skip(14); val res$0 = 
  head incl 5;System.out.println("""res0: week3.IntSet = """ + $show(res$0));$skip(15); val res$1 = 
  head incl -4;System.out.println("""res1: week3.IntSet = """ + $show(res$1))}
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
