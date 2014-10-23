package week4

object hwTest {
  def mergeList(pair: (Char, Int), list: List[(Char, Int)]): List[(Char, Int)] = list match {
    case List() => List(pair)
    case h :: t => if (pair._1.equals(h._1)) (h._1, h._2 + pair._2) :: t else h :: mergeList(pair, t)
  }                                               //> mergeList: (pair: (Char, Int), list: List[(Char, Int)])List[(Char, Int)]

  def times(chars: List[Char]): List[(Char, Int)] = chars match {
    case List() => List()
    case h :: t => mergeList((h, 1), times(t))
  }                                               //> times: (chars: List[Char])List[(Char, Int)]

  times(List('a', 'a', 'b', 'c', 'b', 'a', 'a', 'c', 'c'))
                                                  //> res0: List[(Char, Int)] = List((c,3), (a,4), (b,2))
  var list = List(1, 2, -10, 4, 9, 0)             //> list  : List[Int] = List(1, 2, -10, 4, 9, 0)
  list.head                                       //> res1: Int = 1
  list(2)                                         //> res2: Int = -10
  list(3)                                         //> res3: Int = 4

  var list2 = 12::List() ::: List(1, 2)           //> list2  : List[Int] = List(12, 1, 2)
  list2(1)                                        //> res4: Int = 1
  list2.head                                      //> res5: Int = 12
  list2.tail                                      //> res6: List[Int] = List(1, 2)
}