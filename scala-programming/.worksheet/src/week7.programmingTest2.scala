package week7

object programmingTest2 {
  case class Pos(x: Int, y: Int) {
    /** The position obtained by changing the `x` coordinate by `d` */
    def dx(d: Int) = copy(x = x + d)

    /** The position obtained by changing the `y` coordinate by `d` */
    def dy(d: Int) = copy(y = y + d)
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(406); 
  val v: Vector[Vector[Char]] = Vector(Vector('S', 'T', 'c'), Vector('o', 'c'), Vector('o', 'o'), Vector());System.out.println("""v  : Vector[Vector[Char]] = """ + $show(v ));$skip(181); val res$0 = 

  for {
    i <- 0 until v.size
    j <- 0 until v(i).size
    if (!v(i).isEmpty && (v(i)(j).equals('o') || v(i)(j).equals('T')
      || v(i)(j).equals('S')))
  } yield Pos(i, j);System.out.println("""res0: scala.collection.immutable.IndexedSeq[week7.programmingTest2.Pos] = """ + $show(res$0));$skip(459); 

  def terrainFunction(levelVector: Vector[Vector[Char]]): Pos => Boolean = {
    if (levelVector.isEmpty) (_ => false)
    else {
      val p = for {
        i <- 0 until levelVector.size
        j <- 0 until levelVector(i).size
        if (!levelVector(i).isEmpty && (levelVector(i)(j).equals('o') || levelVector(i)(j).equals('T')
          || levelVector(i)(j).equals('S')))
      } yield Pos(i, j)
      x => if (p.contains(x)) true else false
    }
  };System.out.println("""terrainFunction: (levelVector: Vector[Vector[Char]])week7.programmingTest2.Pos => Boolean""");$skip(37); 

  val terrain = terrainFunction(v);System.out.println("""terrain  : week7.programmingTest2.Pos => Boolean = """ + $show(terrain ));$skip(21); val res$1 = 
  terrain(Pos(0, 0));System.out.println("""res1: Boolean = """ + $show(res$1));$skip(21); val res$2 = 
  terrain(Pos(0, 1));System.out.println("""res2: Boolean = """ + $show(res$2));$skip(21); val res$3 = 
  terrain(Pos(0, 2));System.out.println("""res3: Boolean = """ + $show(res$3));$skip(21); val res$4 = 
  terrain(Pos(0, 3));System.out.println("""res4: Boolean = """ + $show(res$4));$skip(21); val res$5 = 
  terrain(Pos(1, 0));System.out.println("""res5: Boolean = """ + $show(res$5));$skip(21); val res$6 = 
  terrain(Pos(1, 1));System.out.println("""res6: Boolean = """ + $show(res$6));$skip(21); val res$7 = 
  terrain(Pos(1, 2));System.out.println("""res7: Boolean = """ + $show(res$7));$skip(21); val res$8 = 
  terrain(Pos(2, 0));System.out.println("""res8: Boolean = """ + $show(res$8));$skip(21); val res$9 = 
  terrain(Pos(2, 1));System.out.println("""res9: Boolean = """ + $show(res$9))}
}
