package week1

object newtonmethod {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def abs(x: Double): Double = if (x > 0) x else -x
                                                  //> abs: (x: Double)Double
  abs(3)                                          //> res0: Double = 3.0
  abs(-3)                                         //> res1: Double = 3.0

  def newton_iter(guess: Double, a: Double): Double =
    if (isGoodEnough(guess, a)) guess else newton_iter(iter_fun(guess, a), a)
                                                  //> newton_iter: (guess: Double, a: Double)Double

  def isGoodEnough(guess: Double, a: Double) = if (abs(guess * guess - a) / a < 0.01) true else false
                                                  //> isGoodEnough: (guess: Double, a: Double)Boolean
  def iter_fun(guess: Double, a: Double) = (guess + a / guess) / 2
                                                  //> iter_fun: (guess: Double, a: Double)Double
  
  def squreRoot(x:Double)=newton_iter(1,x)        //> squreRoot: (x: Double)Double
  
  squreRoot(3)                                    //> res2: Double = 1.7321428571428572
  squreRoot(2)                                    //> res3: Double = 1.4166666666666665
  
}