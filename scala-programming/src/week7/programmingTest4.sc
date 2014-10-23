package week7

object programmingTest4 {
  case class Pos(x: Int, y: Int) {
    /** The position obtained by changing the `x` coordinate by `d` */
    def dx(d: Int) = copy(x = x + d)

    /** The position obtained by changing the `y` coordinate by `d` */
    def dy(d: Int) = copy(y = y + d)
  }

  case class Block(b1: Pos, b2: Pos) {

    // checks the requirement mentioned above
    require(b1.x <= b2.x && b1.y <= b2.y, "Invalid block position: b1=" + b1 + ", b2=" + b2)

    /**
     * Returns a block where the `x` coordinates of `b1` and `b2` are
     * changed by `d1` and `d2`, respectively.
     */
    def dx(d1: Int, d2: Int) = Block(b1.dx(d1), b2.dx(d2))

    /**
     * Returns a block where the `y` coordinates of `b1` and `b2` are
     * changed by `d1` and `d2`, respectively.
     */
    def dy(d1: Int, d2: Int) = Block(b1.dy(d1), b2.dy(d2))
  }

  //==
  val b1 = new Block(new Pos(0, 0), new Pos(1, 1))//> b1  : week7.programmingTest4.Block = Block(Pos(0,0),Pos(1,1))
  val b2 = new Block(new Pos(0, 0), new Pos(1, 1))//> b2  : week7.programmingTest4.Block = Block(Pos(0,0),Pos(1,1))
  if (b1.equals(b2))
    "equal"
  else
    "no equal"                                    //> res0: String = equal

  if (b1 == b2)
    "=="
  else
    "!="                                          //> res1: String = ==

  //for
  val list = List(("chao", 10), ("ling", 20))     //> list  : List[(String, Int)] = List((chao,10), (ling,20))
  for {
    l <- list
    if (l._2 > 15)
  } yield l                                       //> res2: List[(String, Int)] = List((ling,20))
}