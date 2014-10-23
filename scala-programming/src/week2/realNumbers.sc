package week2

object realNumbers {
  val r1 = new RealNumber(1, 6)                   //> r1  : week2.RealNumber = 1/6
  r1.numerator                                    //> res0: Int = 1
  r1.denominator                                  //> res1: Int = 6

  val r2 = new RealNumber(1, 4)                   //> r2  : week2.RealNumber = 1/4
  r1 + r2                                         //> res2: week2.RealNumber = 5/12
  r1 - r2                                         //> res3: week2.RealNumber = 1/-12
  -r1                                             //> res4: week2.RealNumber = 1/-6
  val r3 = new RealNumber(3, 2)                   //> r3  : week2.RealNumber = 3/2
  r1 - r2 - r3                                    //> res5: week2.RealNumber = -19/12

  val r4 = new RealNumber(4)                      //> r4  : week2.RealNumber = 4/1
}

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