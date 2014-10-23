package week7

object st4 {
  //++
  List(1, 2, 3) ++ List(-2, -3, -4)               //> res0: List[Int] = List(1, 2, 3, -2, -3, -4)
  List(1, 2, 3) :: List(-2, -3, -4)               //> res1: List[Any] = List(List(1, 2, 3), -2, -3, -4)
  List(1, 2, 3) ::: List(-2, -3, -4)              //> res2: List[Int] = List(1, 2, 3, -2, -3, -4)

  //Vector
  val v = Vector(1, 2, 3, 4, 5, 99)               //> v  : scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 4, 5, 99)
  v(3)                                            //> res3: Int = 4
  v(0)                                            //> res4: Int = 1
  v map (_ * 2)                                   //> res5: scala.collection.immutable.Vector[Int] = Vector(2, 4, 6, 8, 10, 198)
  v filter (_ > 4)                                //> res6: scala.collection.immutable.Vector[Int] = Vector(5, 99)
  (v take 3).toList                               //> res7: List[Int] = List(1, 2, 3)
}