package week7

object st1 {
  val stream1 = Stream(1, 2, 3)                   //> stream1  : scala.collection.immutable.Stream[Int] = Stream(1, ?)
  stream1(0)                                      //> res0: Int = 1
  stream1(1)                                      //> res1: Int = 2
  stream1(2)                                      //> res2: Int = 3
  val stream11 = for {
    s <- stream1
    if (s > 3)
  } yield s                                       //> stream11  : scala.collection.immutable.Stream[Int] = Stream()
  stream11.size                                   //> res3: Int = 0
  if (stream11 == Stream.Empty) {
    print("Empty")
  }
  else {
    print("Non empty")
  }                                               //> Empty
  val stream2 = (99 to 1000).toStream             //> stream2  : scala.collection.immutable.Stream[Int] = Stream(99, ?)
  stream2(0)                                      //> res4: Int = 99
  val stream3 = Stream.cons(10, Stream.cons(stream1, Stream.Empty))
                                                  //> stream3  : Stream.Cons[Any] = Stream(10, ?)
  stream3(0)                                      //> res5: Any = 10
  stream3(1)                                      //> res6: Any = Stream(1, 2, 3)
  def isPrime(x: Int): Boolean = {
    (2 to x - 1) forall (m => x % m != 0)
  }                                               //> isPrime: (x: Int)Boolean
  //Stream use}
  ((10 to 1000) filter isPrime)(3)                //> res7: Int = 19
  val primeSet = (10 to 1000).toStream filter isPrime
                                                  //> primeSet  : scala.collection.immutable.Stream[Int] = Stream(11, ?)
  primeSet(3)                                     //> res8: Int = 19
  (primeSet take 100).toList                      //> res9: List[Int] = List(11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 6
                                                  //| 1, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 
                                                  //| 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 2
                                                  //| 29, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 31
                                                  //| 3, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409
                                                  //| , 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499,
                                                  //|  503, 509, 521, 523, 541, 547, 557, 563, 569)

  //Stream support nearly all operator of List, except  ::
  //x::xs always produce List, never a Stream
  //There is however an alternative operator #:: which produce Stream
  //x#::xs == Stream.cons(x,xs)
}