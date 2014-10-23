package week5

object listFun1 {
  val list = 7 :: 1 :: (-9) :: 0 :: 4 :: 19 :: 23 :: Nil
                                                  //> list  : List[Int] = List(7, 1, -9, 0, 4, 19, 23)
  //PartI
  //Use some high order method
  list.takeWhile(x => x > 0)                      //> res0: List[Int] = List(7, 1)
  list.dropWhile(x => x > 0)                      //> res1: List[Int] = List(-9, 0, 4, 19, 23)
  list.span(x => x > 0)                           //> res2: (List[Int], List[Int]) = (List(7, 1),List(-9, 0, 4, 19, 23))
  list.filter(x => x > 0)                         //> res3: List[Int] = List(7, 1, 4, 19, 23)
  list.partition(x => x > 0)                      //> res4: (List[Int], List[Int]) = (List(7, 1, 4, 19, 23),List(-9, 0))
  list reverse                                    //> res5: List[Int] = List(23, 19, 4, 0, -9, 1, 7)

  def squareList(xs: List[Int]): List[Int] = xs match {
    case Nil => xs
    case h :: t => (h * h) :: squareList(t)
  }                                               //> squareList: (xs: List[Int])List[Int]
  //Use a common operation map on lists
  def squareListWithMap(xs: List[Int]): List[Int] = {
    xs.map(x => x * x)
  }                                               //> squareListWithMap: (xs: List[Int])List[Int]
  def posElems(xs: List[Int]): List[Int] = {
    xs.filter(x => x > 0)
  }                                               //> posElems: (xs: List[Int])List[Int]
  squareList(list)                                //> res6: List[Int] = List(49, 1, 81, 0, 16, 361, 529)
  squareListWithMap(list)                         //> res7: List[Int] = List(49, 1, 81, 0, 16, 361, 529)
}