package week7

object programmingTest {
  //copy
  case class Pos(row: Int, col: Int) {
    /** The position obtained by changing the `x` coordinate by `d` */
    def dx(d: Int) = copy(row = row + d)

    /** The position obtained by changing the `y` coordinate by `d` */
    def dy(d: Int) = copy(col = col + d)
  }
  val p = new Pos(10, 20)                         //> p  : week7.programmingTest.Pos = Pos(10,20)
  p.dx(100)                                       //> res0: week7.programmingTest.Pos = Pos(110,20)
  p.dy(1000)                                      //> res1: week7.programmingTest.Pos = Pos(10,1020)

  //
  val level =
    """------
        |--ST--
        |--oo--
        |--oo--
        |------""".stripMargin                    //> level  : String = ------
                                                  //| --ST--
                                                  //| --oo--
                                                  //| --oo--
                                                  //| ------
  level(0)                                        //> res2: Char = -
  level(1)                                        //> res3: Char = -
  level(6)                                        //> res4: Char = 
                                                  //| 
  level(7)                                        //> res5: Char = -
  level(8)                                        //> res6: Char = -
  level(9)                                        //> res7: Char = S
  level.size                                      //> res8: Int = 34
  val level2 =
    """------
        |--ST--
        |--oo--
        |--oo--
        |------"""                                //> level2  : String = ------
                                                  //|         |--ST--
                                                  //|         |--oo--
                                                  //|         |--oo--
                                                  //|         |------
  level2(0)                                       //> res9: Char = -
  level2(1)                                       //> res10: Char = -
  level2(6)                                       //> res11: Char = 
                                                  //| 
  level2(7)                                       //> res12: Char =  
  level2(8)                                       //> res13: Char =  
  level2(9)                                       //> res14: Char =  
  level2.size                                     //> res15: Int = 70

  //
  val v: Vector[Vector[Char]] = Vector(Vector('S', 'T', 'c'), Vector('o', 'o'), Vector('o', 'o'), Vector())
                                                  //> v  : Vector[Vector[Char]] = Vector(Vector(S, T, c), Vector(o, o), Vector(o, 
                                                  //| o), Vector())
  v(0)                                            //> res16: Vector[Char] = Vector(S, T, c)
  v(0)(0)                                         //> res17: Char = S
  v(0)(1)                                         //> res18: Char = T
  val element = for {
    i <- 0 until v.size
    j <- 0 until v(i).size
    if (!v(i).isEmpty)
  } yield (i, j, v(i)(j))                         //> element  : scala.collection.immutable.IndexedSeq[(Int, Int, Char)] = Vector
                                                  //| ((0,0,S), (0,1,T), (0,2,c), (1,0,o), (1,1,o), (2,0,o), (2,1,o))
  for {
    i <- 0 until element.size
    if (element(i)._3.equals('o'))
  } yield element(i)._3                           //> res19: scala.collection.immutable.IndexedSeq[Char] = Vector(o, o, o, o)
  
}