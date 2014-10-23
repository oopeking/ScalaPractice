package week7

object SetTest {
  val set = Set(2, 1, 2, 3, 3)                    //> set  : scala.collection.immutable.Set[Int] = Set(2, 1, 3)
  set.size                                        //> res0: Int = 3
  val set2 = set + 4                              //> set2  : scala.collection.immutable.Set[Int] = Set(2, 1, 3, 4)
  val set3 = set ++ Set(5, 6, 7)                  //> set3  : scala.collection.immutable.Set[Int] = Set(5, 1, 6, 2, 7, 3)
}