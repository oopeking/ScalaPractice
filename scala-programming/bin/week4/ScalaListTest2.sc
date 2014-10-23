package week4

object ScalaListTest2 {
  var list = 1 :: 2 :: 3 :: Nil                   //> list  : List[Int] = List(1, 2, 3)
  list.head                                       //> res0: Int = 1
  list.tail                                       //> res1: List[Int] = List(2, 3)
  list.tail.head                                  //> res2: Int = 2
  list.tail.tail                                  //> res3: List[Int] = List(3)
  list.tail.tail.head                             //> res4: Int = 3
  var lt = list.tail.tail.tail                    //> lt  : List[Int] = List()

  def times(chars: List[Char]): List[(Char, Int)] = chars match {
    case List() => List()
    case h :: t => (h, 1) :: times(t)
  }                                               //> times: (chars: List[Char])List[(Char, Int)]

  def addTimes(list: List[(Char, Int)]): List[(Char, Int)] = ('a', 1) :: List()
                                                  //> addTimes: (list: List[(Char, Int)])List[(Char, Int)]
  times("acadcbbb".toList)                        //> res5: List[(Char, Int)] = List((a,1), (c,1), (a,1), (d,1), (c,1), (b,1), (b,
                                                  //| 1), (b,1))

}