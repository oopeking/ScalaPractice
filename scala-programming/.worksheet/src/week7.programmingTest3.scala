package week7

object programmingTest3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(84); 
  val strV = Vector("1", "22", "91", "-3");System.out.println("""strV  : scala.collection.immutable.Vector[String] = """ + $show(strV ));$skip(39); val res$0 = 
  strV.indexWhere(x => x.equals("91"));System.out.println("""res0: Int = """ + $show(res$0));$skip(111); 

  val vv: Vector[Vector[Char]] = Vector(Vector('S', 'T', 'c'), Vector('o', 'c'), Vector('o', 'o'), Vector());System.out.println("""vv  : Vector[Vector[Char]] = """ + $show(vv ));$skip(85); val res$1 = 
  vv(vv.indexWhere(insideV => insideV.contains('T'))).indexWhere(x => x.equals('T'));System.out.println("""res1: Int = """ + $show(res$1));$skip(38); 
  val list = List(1, Nil, 2, Nil, 33);System.out.println("""list  : List[Any] = """ + $show(list ));$skip(12); val res$2 = 
  list.size;System.out.println("""res2: Int = """ + $show(res$2));$skip(10); val res$3 = 
  list(0);System.out.println("""res3: Any = """ + $show(res$3));$skip(10); val res$4 = 
  list(1);System.out.println("""res4: Any = """ + $show(res$4));$skip(10); val res$5 = 
  list(2);System.out.println("""res5: Any = """ + $show(res$5));$skip(10); val res$6 = 
  list(3);System.out.println("""res6: Any = """ + $show(res$6));$skip(40); 
  val list2=list filter (x => x != Nil);System.out.println("""list2  : List[Any] = """ + $show(list2 ));$skip(13); val res$7 = 
  list2.size;System.out.println("""res7: Int = """ + $show(res$7));$skip(11); val res$8 = 
  list2(2);System.out.println("""res8: Any = """ + $show(res$8))}
}
