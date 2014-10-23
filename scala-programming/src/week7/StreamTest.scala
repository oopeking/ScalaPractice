package week7

class StreamTest {
  def streamRange(lo: Int, hi: Int): Stream[Int] = {
    if (lo > hi) Stream.Empty
    else {
      Stream.cons(lo, streamRange(lo + 1, hi))
    }
  }

  def listRange(lo: Int, hi: Int): List[Int] = {
    if (lo > hi) Nil
    else {
      lo :: listRange(lo + 1, hi)
    }
  }
}