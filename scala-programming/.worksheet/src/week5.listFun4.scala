package week5

object listFun4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(90); 
  val list = 7 :: 1 :: (-9) :: 0 :: 4 :: 19 :: 23 :: Nil;System.out.println("""list  : List[Int] = """ + $show(list ));$skip(79); 
  def sum(xs: List[Int]): Int = {
    0 :: xs reduceLeft ((x, y) => x + y)
  };System.out.println("""sum: (xs: List[Int])Int""");$skip(79); 
  def product(xs: List[Int]): Int = {
    (xs foldLeft 1)((x, y) => x * y)
  };System.out.println("""product: (xs: List[Int])Int""");$skip(12); val res$0 = 
  sum(list);System.out.println("""res0: Int = """ + $show(res$0));$skip(16); val res$1 = 
  sum(List(99));System.out.println("""res1: Int = """ + $show(res$1));$skip(14); val res$2 = 
  sum(List());System.out.println("""res2: Int = """ + $show(res$2));$skip(28); val res$3 = 
  product(List(1, 2, 3, 4));System.out.println("""res3: Int = """ + $show(res$3));$skip(91); 

  def concat[T](xs: List[T], ys: List[T]): List[T] = {
    (xs foldRight ys)(_ :: _)
  };System.out.println("""concat: [T](xs: List[T], ys: List[T])List[T]""");$skip(43); val res$4 = 
  concat(List(1, 23, -4), List(56, 34, 2));System.out.println("""res4: List[Int] = """ + $show(res$4))}
}
