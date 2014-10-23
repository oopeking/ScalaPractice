package week1Test

object listTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def fun(sum: Int): Int = {
    if (sum == 0)
      0
    else {
      if (sum == 1)
        1
      else {
        if (sum == 2)
          2
      }
      3
    }
  }                                               //> fun: (sum: Int)Int

  def findSmallestCoin(coins: List[Int]): Int = {
    if (coins.length == 1) {
      coins.head
    } else {
      var headValue = coins.head
      var restSmallest = findSmallestCoin(coins.tail)
      if (headValue < restSmallest) headValue else restSmallest
    }
  }                                               //> findSmallestCoin: (coins: List[Int])Int

  def sortList(list: List[String]) {
    list.foreach(s => print(s + ' '))
  }                                               //> sortList: (list: List[String])Unit

  println((0).to(10))                             //> Range(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val listInt: List[Int] = List(192, 1, 123, 2, 3)//> listInt  : List[Int] = List(192, 1, 123, 2, 3)
  val listStr: List[String] = List("China", "Shanghai", "Zhangjiang")
                                                  //> listStr  : List[String] = List(China, Shanghai, Zhangjiang)

  sortList(listStr)
}