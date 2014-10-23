package week5

object otherSequence {
  //Array and String are both support the same operations as Seq
  //But they can't be subclasses of Seq as they come from Java
  //Array
  val xs: Array[Int] = Array(1, 2, 3)             //> xs  : Array[Int] = Array(1, 2, 3)
  xs map (x => x + 2)                             //> res0: Array[Int] = Array(3, 4, 5)

  //String
  val ys: String = "Hello World!"                 //> ys  : String = Hello World!
  ys(1)                                           //> res1: Char = e
  ys(2)                                           //> res2: Char = l
  ys filter (_.isUpper)                           //> res3: String = HW

  //Range
  val r: Range = 1 to 5                           //> r  : Range = Range(1, 2, 3, 4, 5)
  val s: Range = 1 until 5                        //> s  : Range = Range(1, 2, 3, 4)
  1 to 11 by 3                                    //> res4: scala.collection.immutable.Range = Range(1, 4, 7, 10)
  10 to 0 by -2                                   //> res5: scala.collection.immutable.Range = Range(10, 8, 6, 4, 2, 0)

  //More Sequence Operations
  xs exists (x => x > 2)                          //> res6: Boolean = true
  xs forall (x => x > 2)                          //> res7: Boolean = false
  ys exists (_.isUpper)                           //> res8: Boolean = true
  ys forall (_.isUpper)                           //> res9: Boolean = false
  val pairs = xs zip ys                           //> pairs  : Array[(Int, Char)] = Array((1,H), (2,e), (3,l))
  pairs.unzip                                     //> res10: (scala.collection.mutable.IndexedSeq[Int], scala.collection.mutable.I
                                                  //| ndexedSeq[Char]) = (ArrayBuffer(1, 2, 3),ArrayBuffer(H, e, l))
  ys flatMap (x => List('.', x))                  //> res11: String = .H.e.l.l.o. .W.o.r.l.d.!
  xs.sum                                          //> res12: Int = 6
  xs.product                                      //> res13: Int = 6
  xs.max                                          //> res14: Int = 3
  xs.min                                          //> res15: Int = 1

  //implement a inner product of two vectors
  def scalaProduct(xs: Vector[Double], ys: Vector[Double]) = {
    (xs.zip(ys)).map(xy => xy._1 * xy._2).sum
  }                                               //> scalaProduct: (xs: Vector[Double], ys: Vector[Double])Double
  scalaProduct(Vector(1, 4, 2), Vector(-3, 0, 9)) //> res16: Double = 15.0

  //Judge whether a number is prime
  def isPrime(n: Int): Boolean = {
    (2 until n) forall (x => n % x != 0)
  }                                               //> isPrime: (n: Int)Boolean
}