package week7

object st2 {
  def expr = {
    def z = { print("z"); 3 }
    val x = { print("x"); 1 }
    lazy val y = { print("y"); 2 }
    z + y + x + z + y + x
  }                                               //> expr: => Int
  expr                                            //> xzyzres0: Int = 12

  //Infinite Streams
  def from(n: Int): Stream[Int] = n #:: from(n + 1)
                                                  //> from: (n: Int)Stream[Int]
  val nat = from(0)                               //> nat  : Stream[Int] = Stream(0, ?)
  val nat1 = nat map (x => x + 4)                 //> nat1  : scala.collection.immutable.Stream[Int] = Stream(4, ?)
  val nat2 = nat map (_ * 4)                      //> nat2  : scala.collection.immutable.Stream[Int] = Stream(0, ?)
  nat1(0)                                         //> res1: Int = 4
  nat1(2)                                         //> res2: Int = 6
  (nat1 take 100).toList                          //> res3: List[Int] = List(4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
                                                  //|  19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37,
                                                  //|  38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56,
                                                  //|  57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75,
                                                  //|  76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94,
                                                  //|  95, 96, 97, 98, 99, 100, 101, 102, 103)
  nat2(3)                                         //> res4: Int = 12
  nat2 take 100                                   //> res5: scala.collection.immutable.Stream[Int] = Stream(0, ?)
  def filterTest(xs: List[Int]): List[Int] = {
    xs filter (_ > 0)
  }                                               //> filterTest: (xs: List[Int])List[Int]
  filterTest(List(1, -4, 34, 0, 29, 8))           //> res6: List[Int] = List(1, 34, 29, 8)

  //Sieve of Eratosthenes
  def sieve(s: Stream[Int]): Stream[Int] = {
    s.head #:: sieve(s.tail filter (_ % s.head != 0))
  }                                               //> sieve: (s: Stream[Int])Stream[Int]
  sieve(from(2)) take 100                         //> res7: scala.collection.immutable.Stream[Int] = Stream(2, ?)

  //Which one gernate Stream faster?
  val N = 10                                      //> N  : Int = 10
  (from(1) filter (_ % N == 0) take 10 toList)    //> res8: List[Int] = List(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
  from(1) map (_ * 10) take N toList              //> res9: List[Int] = List(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
}