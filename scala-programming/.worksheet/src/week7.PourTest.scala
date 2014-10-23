package week7

object PourTest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(73); 
  val pt = new Pouring(Vector(4, 7, 9));System.out.println("""pt  : week7.Pouring = """ + $show(pt ));$skip(11); val res$0 = 
  pt.moves;System.out.println("""res0: scala.collection.immutable.IndexedSeq[Product with Serializable with week7.PourTest.pt.Move] = """ + $show(res$0));$skip(21); val res$1 = 

  pt.path.endState;System.out.println("""res1: week7.PourTest.pt.State = """ + $show(res$1));$skip(89); val res$2 = 
  //The folow command would result "Output exceeds cutoff limit."
  (pt.pathSets).toList;System.out.println("""res2: List[Set[week7.PourTest.pt.Path]] = """ + $show(res$2))}
  //
  /*
  val paths = Set(new pt.Path(Nil))
  val glasses = 0 until 4
  val moves = (for (g <- glasses) yield pt.Empty(g)) ++
    (for (g <- glasses) yield pt.Fill(g)) ++
    (for (from <- glasses; to <- glasses if (from != to)) yield pt.Pour(from, to))
  val path = new pt.Path(Nil)
  val singleNext = moves map path.extend
  val more = for {
    path <- paths
    next <- moves map path.extend
  } yield next
  */
}
