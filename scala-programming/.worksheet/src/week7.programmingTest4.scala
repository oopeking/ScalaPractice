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
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(932); 

  //==
  val b1 = new Block(new Pos(0, 0), new Pos(1, 1));System.out.println("""b1  : week7.programmingTest4.Block = """ + $show(b1 ));$skip(51); 
  val b2 = new Block(new Pos(0, 0), new Pos(1, 1));System.out.println("""b2  : week7.programmingTest4.Block = """ + $show(b2 ));$skip(55); val res$0 = 
  if (b1.equals(b2))
    "equal"
  else
    "no equal";System.out.println("""res0: String = """ + $show(res$0));$skip(43); val res$1 = 

  if (b1 == b2)
    "=="
  else
    "!=";System.out.println("""res1: String = """ + $show(res$1));$skip(56); 

  //for
  val list = List(("chao", 10), ("ling", 20));System.out.println("""list  : List[(String, Int)] = """ + $show(list ));$skip(53); val res$2 = 
  for {
    l <- list
    if (l._2 > 15)
  } yield l;System.out.println("""res2: List[(String, Int)] = """ + $show(res$2))}
}
