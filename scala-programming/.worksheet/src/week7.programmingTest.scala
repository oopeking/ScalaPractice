package week7

object programmingTest {
  //copy
  case class Pos(row: Int, col: Int) {
    /** The position obtained by changing the `x` coordinate by `d` */
    def dx(d: Int) = copy(row = row + d)

    /** The position obtained by changing the `y` coordinate by `d` */
    def dy(d: Int) = copy(col = col + d)
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(344); 
  val p = new Pos(10, 20);System.out.println("""p  : week7.programmingTest.Pos = """ + $show(p ));$skip(12); val res$0 = 
  p.dx(100);System.out.println("""res0: week7.programmingTest.Pos = """ + $show(res$0));$skip(13); val res$1 = 
  p.dy(1000);System.out.println("""res1: week7.programmingTest.Pos = """ + $show(res$1));$skip(114); 

  //
  val level =
    """------
        |--ST--
        |--oo--
        |--oo--
        |------""".stripMargin;System.out.println("""level  : String = """ + $show(level ));$skip(11); val res$2 = 
  level(0);System.out.println("""res2: Char = """ + $show(res$2));$skip(11); val res$3 = 
  level(1);System.out.println("""res3: Char = """ + $show(res$3));$skip(11); val res$4 = 
  level(6);System.out.println("""res4: Char = """ + $show(res$4));$skip(11); val res$5 = 
  level(7);System.out.println("""res5: Char = """ + $show(res$5));$skip(11); val res$6 = 
  level(8);System.out.println("""res6: Char = """ + $show(res$6));$skip(11); val res$7 = 
  level(9);System.out.println("""res7: Char = """ + $show(res$7));$skip(13); val res$8 = 
  level.size;System.out.println("""res8: Int = """ + $show(res$8));$skip(96); 
  val level2 =
    """------
        |--ST--
        |--oo--
        |--oo--
        |------""";System.out.println("""level2  : String = """ + $show(level2 ));$skip(12); val res$9 = 
  level2(0);System.out.println("""res9: Char = """ + $show(res$9));$skip(12); val res$10 = 
  level2(1);System.out.println("""res10: Char = """ + $show(res$10));$skip(12); val res$11 = 
  level2(6);System.out.println("""res11: Char = """ + $show(res$11));$skip(12); val res$12 = 
  level2(7);System.out.println("""res12: Char = """ + $show(res$12));$skip(12); val res$13 = 
  level2(8);System.out.println("""res13: Char = """ + $show(res$13));$skip(12); val res$14 = 
  level2(9);System.out.println("""res14: Char = """ + $show(res$14));$skip(14); val res$15 = 
  level2.size;System.out.println("""res15: Int = """ + $show(res$15));$skip(115); 

  //
  val v: Vector[Vector[Char]] = Vector(Vector('S', 'T', 'c'), Vector('o', 'o'), Vector('o', 'o'), Vector());System.out.println("""v  : Vector[Vector[Char]] = """ + $show(v ));$skip(7); val res$16 = 
  v(0);System.out.println("""res16: Vector[Char] = """ + $show(res$16));$skip(10); val res$17 = 
  v(0)(0);System.out.println("""res17: Char = """ + $show(res$17));$skip(10); val res$18 = 
  v(0)(1);System.out.println("""res18: Char = """ + $show(res$18));$skip(122); 
  val element = for {
    i <- 0 until v.size
    j <- 0 until v(i).size
    if (!v(i).isEmpty)
  } yield (i, j, v(i)(j));System.out.println("""element  : scala.collection.immutable.IndexedSeq[(Int, Int, Char)] = """ + $show(element ));$skip(97); val res$19 = 
  for {
    i <- 0 until element.size
    if (element(i)._3.equals('o'))
  } yield element(i)._3;System.out.println("""res19: scala.collection.immutable.IndexedSeq[Char] = """ + $show(res$19))}
  
}
