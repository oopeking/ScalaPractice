package week4

object ScalaListSort {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 
  val numList = List(1, 23, 4, -1, 678);System.out.println("""numList  : List[Int] = """ + $show(numList ));$skip(124); 

  def iSort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y :: ys => insert(y, iSort(ys))
  };System.out.println("""iSort: (xs: List[Int])List[Int]""");$skip(159); 

  def insert(y: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(y)
    case yy :: ys => if (y < yy) y :: xs else yy :: insert(y, ys)
  };System.out.println("""insert: (y: Int, xs: List[Int])List[Int]""");$skip(88); val res$0 = 

  //Seems the line should not put before the def of iSort and insert
  iSort(numList);System.out.println("""res0: List[Int] = """ + $show(res$0))}
}
