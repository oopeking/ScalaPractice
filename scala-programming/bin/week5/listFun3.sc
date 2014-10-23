package week5

object listFun3 {

  val list = 7 :: 1 :: (-9) :: 0 :: 4 :: 19 :: 23 :: Nil
                                                  //> list  : List[Int] = List(7, 1, -9, 0, 4, 19, 23)
  //PartIII
  def pack[T](list: List[T]): List[List[T]] = list match {
    case Nil => Nil
    case h :: t =>
      {
        val (first, rest) = list.span(y => y == h)
        first :: pack(rest)
      }
  }                                               //> pack: [T](list: List[T])List[List[T]]

  def encode[T](xs: List[T]): List[(T, Int)] = xs match {
    case Nil => Nil
    case h :: t => pack(xs).map(ys => (ys.head, ys.length))
  }                                               //> encode: [T](xs: List[T])List[(T, Int)]
  val packList = List("a", "a", "a", "b", "b", "b", "b", "c", "c", "a")
                                                  //> packList  : List[String] = List(a, a, a, b, b, b, b, c, c, a)
  pack(packList)                                  //> res0: List[List[String]] = List(List(a, a, a), List(b, b, b, b), List(c, c),
                                                  //|  List(a))
  encode(packList)                                //> res1: List[(String, Int)] = List((a,3), (b,4), (c,2), (a,1))
}