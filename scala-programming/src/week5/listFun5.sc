package week5

object listFun5 {
  def f1(xs: List[Int]): List[Int] = {
    xs map (x => x * 3)
  }                                               //> f1: (xs: List[Int])List[Int]
  def isPrime(n: Int) = {
    (2 until n) forall (i => n % i != 0)
  }                                               //> isPrime: (n: Int)Boolean
  def allPrimePair(n: Int)(implicit ord: Ordering[Int]) = {
    (2 until n) map (i => (1 until i) map (j => (i, j)))
  }                                               //> allPrimePair: (n: Int)(implicit ord: Ordering[Int])scala.collection.immutabl
                                                  //| e.IndexedSeq[scala.collection.immutable.IndexedSeq[(Int, Int)]]

  //zip
  List(1, 2, 3) zip List("a", "b", "c", "d")      //> res0: List[(Int, String)] = List((1,a), (2,b), (3,c))
  //map
  f1(List(1, 2, 3, 4))                            //> res1: List[Int] = List(3, 6, 9, 12)
  //get all pair and use flatten
  allPrimePair(7)                                 //> res2: scala.collection.immutable.IndexedSeq[scala.collection.immutable.Index
                                                  //| edSeq[(Int, Int)]] = Vector(Vector((2,1)), Vector((3,1), (3,2)), Vector((4,1
                                                  //| ), (4,2), (4,3)), Vector((5,1), (5,2), (5,3), (5,4)), Vector((6,1), (6,2), (
                                                  //| 6,3), (6,4), (6,5)))
  allPrimePair(7).flatten                         //> res3: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,1
                                                  //| ), (3,2), (4,1), (4,2), (4,3), (5,1), (5,2), (5,3), (5,4), (6,1), (6,2), (6,
                                                  //| 3), (6,4), (6,5))
  //use flatmap
  val pair = (2 until 7) flatMap (i => (1 until i) map (j => (i, j)))
                                                  //> pair  : scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3
                                                  //| ,1), (3,2), (4,1), (4,2), (4,3), (5,1), (5,2), (5,3), (5,4), (6,1), (6,2), (
                                                  //| 6,3), (6,4), (6,5))
  //use filter to get all pair whos sum is a prime
  pair filter (p => isPrime(p._1 + p._2))         //> res4: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2), (6,1), (6,5))
                                                  
}