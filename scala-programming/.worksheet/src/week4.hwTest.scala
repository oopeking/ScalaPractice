package week4

object hwTest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(261); 
  def mergeList(pair: (Char, Int), list: List[(Char, Int)]): List[(Char, Int)] = list match {
    case List() => List(pair)
    case h :: t => if (pair._1.equals(h._1)) (h._1, h._2 + pair._2) :: t else h :: mergeList(pair, t)
  };System.out.println("""mergeList: (pair: (Char, Int), list: List[(Char, Int)])List[(Char, Int)]""");$skip(145); 

  def times(chars: List[Char]): List[(Char, Int)] = chars match {
    case List() => List()
    case h :: t => mergeList((h, 1), times(t))
  };System.out.println("""times: (chars: List[Char])List[(Char, Int)]""");$skip(61); val res$0 = 

  times(List('a', 'a', 'b', 'c', 'b', 'a', 'a', 'c', 'c'));System.out.println("""res0: List[(Char, Int)] = """ + $show(res$0));$skip(38); 
  var list = List(1, 2, -10, 4, 9, 0);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(12); val res$1 = 
  list.head;System.out.println("""res1: Int = """ + $show(res$1));$skip(10); val res$2 = 
  list(2);System.out.println("""res2: Int = """ + $show(res$2));$skip(10); val res$3 = 
  list(3);System.out.println("""res3: Int = """ + $show(res$3));$skip(42); 

  var list2 = 12::List() ::: List(1, 2);System.out.println("""list2  : List[Int] = """ + $show(list2 ));$skip(11); val res$4 = 
  list2(1);System.out.println("""res4: Int = """ + $show(res$4));$skip(13); val res$5 = 
  list2.head;System.out.println("""res5: Int = """ + $show(res$5));$skip(13); val res$6 = 
  list2.tail;System.out.println("""res6: List[Int] = """ + $show(res$6))}
}
