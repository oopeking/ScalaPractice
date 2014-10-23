package week4
import scala.collection.immutable._

object ScalaListTest {
  val empty = List()                              //> empty  : List[Nothing] = List()
  val strList = List("fang", "chao")              //> strList  : List[String] = List(fang, chao)
  strList.head                                    //> res0: String = fang
  val numList = List(1, 2, 3)                     //> numList  : List[Int] = List(1, 2, 3)
  numList.tail                                    //> res1: List[Int] = List(2, 3)
  val numList2 = 4 :: (5 :: (6 :: Nil))           //> numList2  : List[Int] = List(4, 5, 6)
  val numList3 = 1 :: 2 :: 3 :: Nil               //> numList3  : List[Int] = List(1, 2, 3)
  val numList4 = Nil.::(3).::(2).::(1)            //> numList4  : List[Int] = List(1, 2, 3)
  val numList5 = 100 :: numList3                  //> numList5  : List[Int] = List(100, 1, 2, 3)
  numList5.tail.tail                              //> res2: List[Int] = List(2, 3)
  //Please compare :: and :::
  //::
  val numList6 = List(101, 102, 103, 104) :: numList3
                                                  //> numList6  : List[Any] = List(List(101, 102, 103, 104), 1, 2, 3)
  numList6.head                                   //> res3: Any = List(101, 102, 103, 104)
  numList6.tail                                   //> res4: List[Any] = List(1, 2, 3)
  
  //:::
  val numList66=List(101,102,103,104):::numList3  //> numList66  : List[Int] = List(101, 102, 103, 104, 1, 2, 3)
  numList66.head                                  //> res5: Int = 101
  numList66.tail                                  //> res6: List[Int] = List(102, 103, 104, 1, 2, 3)
  
  empty.head                                      //> java.util.NoSuchElementException: head of empty list
                                                  //| 	at scala.collection.immutable.Nil$.head(List.scala:337)
                                                  //| 	at scala.collection.immutable.Nil$.head(List.scala:334)
                                                  //| 	at week4.ScalaListTest$$anonfun$main$1.apply$mcV$sp(week4.ScalaListTest.
                                                  //| scala:26)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week4.ScalaListTest$.main(week4.ScalaListTest.scala:4)
                                                  //| 	at week4.ScalaListTest.main(week4.ScalaListTest.scala)
}