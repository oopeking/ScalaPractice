package week7

object PourTest {
  val pt = new Pouring(Vector(4, 7, 9))           //> java.lang.IndexOutOfBoundsException: 3
                                                  //| 	at scala.collection.immutable.Vector.checkRangeConvert(Vector.scala:137)
                                                  //| 
                                                  //| 	at scala.collection.immutable.Vector.updateAt(Vector.scala:228)
                                                  //| 	at scala.collection.immutable.Vector.updated(Vector.scala:144)
                                                  //| 	at week7.Pouring$Empty.change(Pouring.scala:12)
                                                  //| 	at week7.Pouring$Path.trackState(Pouring.scala:35)
                                                  //| 	at week7.Pouring$Path.trackState(Pouring.scala:35)
                                                  //| 	at week7.Pouring$Path.trackState(Pouring.scala:35)
                                                  //| 	at week7.Pouring$Path.trackState(Pouring.scala:35)
                                                  //| 	at week7.Pouring$Path.trackState(Pouring.scala:35)
                                                  //| 	at week7.Pouring$Path.<init>(Pouring.scala:30)
                                                  //| 	at week7.Pouring.<init>(Pouring.scala:41)
                                                  //| 	at week7.PourTest$$anonfun$main$1.apply$mcV$sp(week7.PourTest.scala:4)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:
                                                  //| Output exceeds cutoff limit.
  pt.moves

  pt.path.endState
  //The folow command would result "Output exceeds cutoff limit."
  (pt.pathSets).toList
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