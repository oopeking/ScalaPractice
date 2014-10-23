package week4

object ScalaListTest2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(71); 
  var list = 1 :: 2 :: 3 :: Nil;System.out.println("""list  : List[Int] = """ + $show(list ));$skip(12); val res$0 = 
  list.head;System.out.println("""res0: Int = """ + $show(res$0));$skip(12); val res$1 = 
  list.tail;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(17); val res$2 = 
  list.tail.head;System.out.println("""res2: Int = """ + $show(res$2));$skip(17); val res$3 = 
  list.tail.tail;System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(22); val res$4 = 
  list.tail.tail.head;System.out.println("""res4: Int = """ + $show(res$4));$skip(31); 
  var lt = list.tail.tail.tail;System.out.println("""lt  : List[Int] = """ + $show(lt ));$skip(136); 

  def times(chars: List[Char]): List[(Char, Int)] = chars match {
    case List() => List()
    case h :: t => (h, 1) :: times(t)
  };System.out.println("""times: (chars: List[Char])List[(Char, Int)]""");$skip(82); 

  def addTimes(list: List[(Char, Int)]): List[(Char, Int)] = ('a', 1) :: List();System.out.println("""addTimes: (list: List[(Char, Int)])List[(Char, Int)]""");$skip(27); val res$5 = 
  times("acadcbbb".toList);System.out.println("""res5: List[(Char, Int)] = """ + $show(res$5))}

}
