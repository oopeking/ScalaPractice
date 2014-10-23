package week5

class ListMethod {

}

object ListMethod extends App {
  //This is intended to get the last element of the list
  def last[T](list: List[T]): T = list match {
    case List() => throw new Error("Empty list does not have last element")
    case List(x) => x
    case h :: tail => last(tail)
  }

  //This is intended to get the elements of the list, except the last element
  def init[T](list: List[T]): List[T] = list match {
    case List() => throw new Error("Empty list does not have init elements")
    case List(x) => List()
    case h :: tail => List(h) ::: init(tail)
  }
}