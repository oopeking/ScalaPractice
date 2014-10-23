package week2

class RealNumber(x: Int, y: Int) {
  //require is a predefined funciton
  require(y != 0, "The denominator must not be 0!")

  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)
  def numerator = x / g
  def denominator = y / g

  def <(that: RealNumber) = if (numerator * that.denominator < denominator * that.numerator) true else false
  def max(that: RealNumber) = if (this < that) that else this
  def +(that: RealNumber) = {
    new RealNumber(numerator * that.denominator + denominator * that.numerator, denominator * that.denominator)
  }
  //Define the subtraction operation
  //Hereby we use "unary_ :", and we get prefix operators.
  def unary_- : RealNumber =
    new RealNumber(-numerator, denominator)
  def -(that: RealNumber) = this + -that

  override def toString = {
    numerator + "/" + denominator
  }
}