package week7

object programmingTest2 {
  case class Pos(x: Int, y: Int) {
    /** The position obtained by changing the `x` coordinate by `d` */
    def dx(d: Int) = copy(x = x + d)

    /** The position obtained by changing the `y` coordinate by `d` */
    def dy(d: Int) = copy(y = y + d)
  }
  val v: Vector[Vector[Char]] = Vector(Vector('S', 'T', 'c'), Vector('o', 'c'), Vector('o', 'o'), Vector())
                                                  //> v  : Vector[Vector[Char]] = Vector(Vector(S, T, c), Vector(o, c), Vector(o, 
                                                  //| o), Vector())

  for {
    i <- 0 until v.size
    j <- 0 until v(i).size
    if (!v(i).isEmpty && (v(i)(j).equals('o') || v(i)(j).equals('T')
      || v(i)(j).equals('S')))
  } yield Pos(i, j)                               //> res0: scala.collection.immutable.IndexedSeq[week7.programmingTest2.Pos] = Ve
                                                  //| ctor(Pos(0,0), Pos(0,1), Pos(1,0), Pos(2,0), Pos(2,1))

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
  }                                               //> terrainFunction: (levelVector: Vector[Vector[Char]])week7.programmingTest2.
                                                  //| Pos => Boolean

  val terrain = terrainFunction(v)                //> terrain  : week7.programmingTest2.Pos => Boolean = <function1>
  terrain(Pos(0, 0))                              //> res1: Boolean = true
  terrain(Pos(0, 1))                              //> res2: Boolean = true
  terrain(Pos(0, 2))                              //> res3: Boolean = false
  terrain(Pos(0, 3))                              //> res4: Boolean = false
  terrain(Pos(1, 0))                              //> res5: Boolean = true
  terrain(Pos(1, 1))                              //> res6: Boolean = false
  terrain(Pos(1, 2))                              //> res7: Boolean = false
  terrain(Pos(2, 0))                              //> res8: Boolean = true
  terrain(Pos(2, 1))                              //> res9: Boolean = true
}