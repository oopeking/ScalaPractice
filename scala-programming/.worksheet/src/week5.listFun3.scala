package week5

object listFun3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(92); 

  val list = 7 :: 1 :: (-9) :: 0 :: 4 :: 19 :: 23 :: Nil;System.out.println("""list  : List[Int] = """ + $show(list ));$skip(209); 
  //PartIII
  def pack[T](list: List[T]): List[List[T]] = list match {
    case Nil => Nil
    case h :: t =>
      {
        val (first, rest) = list.span(y => y == h)
        first :: pack(rest)
      }
  };System.out.println("""pack: [T](list: List[T])List[List[T]]""");$skip(144); 

  def encode[T](xs: List[T]): List[(T, Int)] = xs match {
    case Nil => Nil
    case h :: t => pack(xs).map(ys => (ys.head, ys.length))
  };System.out.println("""encode: [T](xs: List[T])List[(T, Int)]""");$skip(72); 
  val packList = List("a", "a", "a", "b", "b", "b", "b", "c", "c", "a");System.out.println("""packList  : List[String] = """ + $show(packList ));$skip(17); val res$0 = 
  pack(packList);System.out.println("""res0: List[List[String]] = """ + $show(res$0));$skip(19); val res$1 = 
  encode(packList);System.out.println("""res1: List[(String, Int)] = """ + $show(res$1))}
}
