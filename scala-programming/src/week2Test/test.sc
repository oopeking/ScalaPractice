package week2Test

object test {

  def f(a: Int) = {
    if (a > 5 || a < 4)
      println(a)
  }                                               //> f: (a: Int)Unit

  f(3)                                            //> 3
}