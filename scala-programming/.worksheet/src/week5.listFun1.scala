package week5

object listFun1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(90); 
  val list = 7 :: 1 :: (-9) :: 0 :: 4 :: 19 :: 23 :: Nil;System.out.println("""list  : List[Int] = """ + $show(list ));$skip(70); val res$0 = 
  //PartI
  //Use some high order method
  list.takeWhile(x => x > 0);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(29); val res$1 = 
  list.dropWhile(x => x > 0);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(24); val res$2 = 
  list.span(x => x > 0);System.out.println("""res2: (List[Int], List[Int]) = """ + $show(res$2));$skip(26); val res$3 = 
  list.filter(x => x > 0);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(29); val res$4 = 
  list.partition(x => x > 0);System.out.println("""res4: (List[Int], List[Int]) = """ + $show(res$4));$skip(15); val res$5 = 
  list reverse;System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(125); 

  def squareList(xs: List[Int]): List[Int] = xs match {
    case Nil => xs
    case h :: t => (h * h) :: squareList(t)
  };System.out.println("""squareList: (xs: List[Int])List[Int]""");$skip(121); 
  //Use a common operation map on lists
  def squareListWithMap(xs: List[Int]): List[Int] = {
    xs.map(x => x * x)
  };System.out.println("""squareListWithMap: (xs: List[Int])List[Int]""");$skip(75); 
  def posElems(xs: List[Int]): List[Int] = {
    xs.filter(x => x > 0)
  };System.out.println("""posElems: (xs: List[Int])List[Int]""");$skip(19); val res$6 = 
  squareList(list);System.out.println("""res6: List[Int] = """ + $show(res$6));$skip(26); val res$7 = 
  squareListWithMap(list);System.out.println("""res7: List[Int] = """ + $show(res$7))}
}
