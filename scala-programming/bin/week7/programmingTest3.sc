package week7

object programmingTest3 {
  val strV = Vector("1", "22", "91", "-3")        //> strV  : scala.collection.immutable.Vector[String] = Vector(1, 22, 91, -3)
  strV.indexWhere(x => x.equals("91"))            //> res0: Int = 2

  val vv: Vector[Vector[Char]] = Vector(Vector('S', 'T', 'c'), Vector('o', 'c'), Vector('o', 'o'), Vector())
                                                  //> vv  : Vector[Vector[Char]] = Vector(Vector(S, T, c), Vector(o, c), Vector(o,
                                                  //|  o), Vector())
  vv(vv.indexWhere(insideV => insideV.contains('T'))).indexWhere(x => x.equals('T'))
                                                  //> res1: Int = 1
  val list = List(1, Nil, 2, Nil, 33)             //> list  : List[Any] = List(1, List(), 2, List(), 33)
  list.size                                       //> res2: Int = 5
  list(0)                                         //> res3: Any = 1
  list(1)                                         //> res4: Any = List()
  list(2)                                         //> res5: Any = 2
  list(3)                                         //> res6: Any = List()
  val list2=list filter (x => x != Nil)           //> list2  : List[Any] = List(1, 2, 33)
  list2.size                                      //> res7: Int = 3
  list2(2)                                        //> res8: Any = 33
}