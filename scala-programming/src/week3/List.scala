package week3

trait List[T] {
  def isEmpty: Boolean
  def headOp: T
  def tailOp: List[T]
}

class Conn[T](head: T, tail: List[T]) extends List[T] {
  override def isEmpty: Boolean = false
  override def headOp: T = head
  override def tailOp: List[T] = tail
}

class Nil[T] extends List[T] {
  def isEmpty: Boolean = true
  def headOp: Nothing = throw new NoSuchElementException
  def tailOp: Nothing = throw new NoSuchElementException
}

