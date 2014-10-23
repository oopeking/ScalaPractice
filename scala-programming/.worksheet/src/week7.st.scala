package week7

object st {
package week7

object streamTest {
  val stream1 = Stream(1, 2, 3)
  stream1(0)
  stream1(1)
  stream1(2)
  val stream2 = (99 to 1000).toStream
  stream2(0)
  val stream3 = Stream.cons(10, Stream.cons(stream1, Stream.Empty))
  stream3(0)
  stream3(1)
  def isPrime(x: Int): Boolean = {
    (2 to x - 1) forall (m => x % m == 0)
  }
  //Stream use
  (10 to 10000)
}
}
