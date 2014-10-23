package week1Test

object Main extends App {
  def printStrList(list: List[String]) {
    list.foreach(s => println(s + ' '))
  }
  def sortIntList(list: List[Int]) {
    list.sortWith(_.compareTo(_) < 0)
    list.foreach((s: Int) => println(s + ' '))
  }

  def quickSort(list: List[Int]): List[Int] = list match {
    case Nil => Nil
    case head :: tail => {
      val (x1, x2) = tail.partition(list.head>);
      quickSort(x1) ::: head :: quickSort(x2)
    }
  }

  val listStr: List[String] = List("China", "Shanghai", "Zhangjiang")
  val listInt: List[Int] = List(19, 1, 123, 2, 3)
  printStrList(listStr)
  sortIntList(listInt)
  println(quickSort(listInt))
  sortIntList(quickSort(listInt))
}