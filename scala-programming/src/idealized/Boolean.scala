package idealized

abstract class Boolean {
  def ifThenElse[T](t: => T, e: => T): T

  def &&(x: => Boolean) = ifThenElse(x, false)
  def ||(x: => Boolean) = ifThenElse(true, x)
  def unary_! = ifThenElse(false, true)
  def ==(x: Boolean) = ifThenElse(x, x.unary_!)
  def !=(x: Boolean) = ifThenElse(x.unary_!, x)
  def <(x: Boolean) = ifThenElse(false, x)

}

class False extends Boolean {
  //Hereby we must define ifThenElse method
  def ifThenElse[T](t: => T, e: => T) = e
}
class True extends Boolean {
  //Define ifThenElse method
  def ifThenElse[T](t: => T, e: => T) = t
}
