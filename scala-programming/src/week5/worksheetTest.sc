package week5

object worksheetTest {
  val part1List = 1 :: 0 :: 19 :: Nil             //> part1List  : List[Int] = List(1, 0, 19)
  val part2List = -23 :: 137 :: 5 :: Nil          //> part2List  : List[Int] = List(-23, 137, 5)
  //Create a new list, we could also use :::
  val numList = part1List ++ part2List            //> numList  : List[Int] = List(1, 0, 19, -23, 137, 5)
  //Reverse the list
  numList.reverse                                 //> res0: List[Int] = List(5, 137, -23, 19, 0, 1)
  //Update the element at certain index, others retain the same
  numList updated (2, 2)                          //> res1: List[Int] = List(1, 0, 2, -23, 137, 5)
  numList.updated(3, 2)                           //> res2: List[Int] = List(1, 0, 19, 2, 137, 5)
  //Basic method in List
  numList.head                                    //> res3: Int = 1
  numList.tail                                    //> res4: List[Int] = List(0, 19, -23, 137, 5)
  //Remember scala list has the 0 index
  numList.indexOf(19)                             //> res5: Int = 2
  numList.indexOf(100)                            //> res6: Int = -1
  numList.contains(100)                           //> res7: Boolean = false
  numList.contains(19)                            //> res8: Boolean = true
  //Task 4 element from the list
  numList.take(4)                                 //> res9: List[Int] = List(1, 0, 19, -23)
  //Return the remaian elements after we remove the first 3 element
  numList.drop(3)                                 //> res10: List[Int] = List(-23, 137, 5)
  numList.length                                  //> res11: Int = 6
  //Return the element except the last one
  numList.init                                    //> res12: List[Int] = List(1, 0, 19, -23, 137)
  numList.last                                    //> res13: Int = 5
  //SplitAt method
  val (firstPart, secondPart) = numList.splitAt(4)//> firstPart  : List[Int] = List(1, 0, 19, -23)
                                                  //| secondPart  : List[Int] = List(137, 5)
  numList                                         //> res14: List[Int] = List(1, 0, 19, -23, 137, 5)
  numList(2)                                      //> res15: Int = 19
  //Please this two functions
  List().length                                   //> res16: Int = 0
  Nil.length                                      //> res17: Int = 0
}