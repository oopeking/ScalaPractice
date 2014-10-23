package week2

import math.abs

object FindFixedPoint {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def isGoodEnough(a: Double, b: Double): Boolean =
    {
      val v = abs(a - b) / b
      if (v < 0.00001) true else false
    }                                             //> isGoodEnough: (a: Double, b: Double)Boolean

  def fixedPoint(f: Double => Double)(firstGuess: Double): Double = {
    def iterate(guess: Double): Double =
      {
        val next = f(guess)
        if (isGoodEnough(guess, next)) guess
        else
          iterate(next)
      }
    iterate(firstGuess)
  }                                               //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double

  fixedPoint(x => 1 + x / 2)(1)                   //> res0: Double = 1.999969482421875

  //We can use newton iteration method to get the square root of an integer
  //But hereby we somehow get a new insight to treat our square root issue as an fixed point issue.
  //Also, please note the y=>(y+x/y)/2
  def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2
                                                  //> averageDamp: (f: Double => Double)(x: Double)Double
  def square(x: Double) = fixedPoint(averageDamp(y => x / y))(1)
                                                  //> square: (x: Double)Double
  square(2)                                       //> res1: Double = 1.4142156862745097
  square(3)                                       //> res2: Double = 1.7320508100147274
}