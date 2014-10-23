package week5

object listFun2 {
  val list = 7 :: 1 :: (-9) :: 0 :: 4 :: 19 :: 23 :: Nil
                                                  //> list  : List[Int] = List(7, 1, -9, 0, 4, 19, 23)
  //PartII
  //Use implicit and pair pattern match
  def mergeSort[T](list: List[T])(implicit ord: Ordering[T]): List[T] = list match {
    case List() => List()
    case h :: t => {
      //Pattern match over pair/tuples
      def pairMerge(list1: List[T], list2: List[T]): List[T] = (list1, list2) match {
        case (List(), List()) => List()
        case (List(), h2 :: t2) => list2
        case (h1 :: t1, List()) => list1
        case (h1 :: t1, h2 :: t2) => if (ord.lt(h1, h2)) h1 :: pairMerge(t1, list2) else h2 :: pairMerge(list1, t2)
      }

      val halfLength = list.length / 2
      if (halfLength == 0) {
        list
      } else {
        val (firstPart, secondPart) = list.splitAt(halfLength)
        pairMerge(mergeSort(firstPart), mergeSort(secondPart))
      }
    }
  }                                               //> mergeSort: [T](list: List[T])(implicit ord: Ordering[T])List[T]
  val fruitList = List("Bnana", "pipe", "apple", "orange", "benapple")
                                                  //> fruitList  : List[String] = List(Bnana, pipe, apple, orange, benapple)
  //Self defined compared function
  //  print(mergeSort(list)((x, y) => x < y))
  //  print(mergeSort(fruitList)((x, y) => x.compareTo(y) < 0))
  mergeSort(list)                                 //> res0: List[Int] = List(-9, 0, 1, 4, 7, 19, 23)
  mergeSort(fruitList)                            //> res1: List[String] = List(Bnana, apple, benapple, orange, pipe)
}