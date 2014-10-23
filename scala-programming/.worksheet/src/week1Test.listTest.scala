package week1Test

object listTest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(81); 
  println("Welcome to the Scala worksheet");$skip(171); 

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
  };System.out.println("""fun: (sum: Int)Int""");$skip(272); 

  def findSmallestCoin(coins: List[Int]): Int = {
    if (coins.length == 1) {
      coins.head
    } else {
      var headValue = coins.head
      var restSmallest = findSmallestCoin(coins.tail)
      if (headValue < restSmallest) headValue else restSmallest
    }
  };System.out.println("""findSmallestCoin: (coins: List[Int])Int""");$skip(81); 

  def sortList(list: List[String]) {
    list.foreach(s => print(s + ' '))
  };System.out.println("""sortList: (list: List[String])Unit""");$skip(24); 

  println((0).to(10));$skip(51); 
  val listInt: List[Int] = List(192, 1, 123, 2, 3);System.out.println("""listInt  : List[Int] = """ + $show(listInt ));$skip(70); 
  val listStr: List[String] = List("China", "Shanghai", "Zhangjiang");System.out.println("""listStr  : List[String] = """ + $show(listStr ));$skip(22); 

  sortList(listStr)}
}
