package week7

object st4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(71); val res$0 = 
  //++
  List(1, 2, 3) ++ List(-2, -3, -4);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(36); val res$1 = 
  List(1, 2, 3) :: List(-2, -3, -4);System.out.println("""res1: List[Any] = """ + $show(res$1));$skip(37); val res$2 = 
  List(1, 2, 3) ::: List(-2, -3, -4);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(49); 

  //Vector
  val v = Vector(1, 2, 3, 4, 5, 99);System.out.println("""v  : scala.collection.immutable.Vector[Int] = """ + $show(v ));$skip(7); val res$3 = 
  v(3);System.out.println("""res3: Int = """ + $show(res$3));$skip(7); val res$4 = 
  v(0);System.out.println("""res4: Int = """ + $show(res$4));$skip(16); val res$5 = 
  v map (_ * 2);System.out.println("""res5: scala.collection.immutable.Vector[Int] = """ + $show(res$5));$skip(19); val res$6 = 
  v filter (_ > 4);System.out.println("""res6: scala.collection.immutable.Vector[Int] = """ + $show(res$6));$skip(20); val res$7 = 
  (v take 3).toList;System.out.println("""res7: List[Int] = """ + $show(res$7))}
}
