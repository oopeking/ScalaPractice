package week7

class Pouring(capacity: Vector[Int]) {
  //State
  type State = Vector[Int]
  val initialState = capacity map (_ => 0)
  val glasses = 0 until capacity.length
  //Move
  trait Move {
    def change(state: State): State
  }
  case class Empty(glass: Int) extends Move {
    def change(state: State): State = state updated (glass, 0)
  }
  case class Fill(glass: Int) extends Move {
    def change(state: State): State = state updated (glass, capacity(glass))
  }
  case class Pour(from: Int, to: Int) extends Move {
    def change(state: State): State = {
      val amount = state(from) min (capacity(to) - state(to))
      state updated (from, state(from) - amount) updated (to, state(to) + amount)
    }
  }
  val moves = (for (g <- glasses) yield Empty(g)) ++
    (for (g <- glasses) yield Fill(g)) ++
    (for (from <- glasses; to <- glasses if (from != to)) yield Pour(from, to))

  //Path
  class Path(history: List[Move]) {
    val endState: State = trackState(history)
    //Or, We have another way to set the val endeState as follow:
    //val endState: State = (history foldRight initialState)(_ change _)
    private def trackState(xs: List[Move]): State = xs match {
      case Nil => initialState
      case move :: xs1 => move change trackState(xs1)
    }
    def extend(move: Move): Path = new Path(move :: history)
    override def toString = (history.reverse mkString " ") + "-->" + endState
  }

  //val path = new Path(List(Empty(0), Empty(1), Empty(2), Empty(3), Fill(0), Fill(1), Fill(2), Pour(0, 3)) reverse)
  val initialPath = new Path(Nil)
  def from(paths: Set[Path]): Stream[Set[Path]] = {
    if (paths.isEmpty) Stream.Empty
    else {
      val more = for {
        path <- paths
        next <- moves map path.extend
      } yield next
      paths #:: from(more)
    }
  }
  val pathSets = from(Set(initialPath))
}