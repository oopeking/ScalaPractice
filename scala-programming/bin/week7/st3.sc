package week7

object st3 {
  //sqrtRoot
  def sqrtStream(x: Double): Stream[Double] = {
    def improve(guess: Double) = (guess + (x / guess)) / 2
    lazy val guesses: Stream[Double] = 1 #:: (guesses map improve)
    guesses
  }                                               //> sqrtStream: (x: Double)Stream[Double]
  sqrtStream(4)                                   //> res0: Stream[Double] = Stream(1.0, ?)
  (sqrtStream(4) take 10).toList                  //> res1: List[Double] = List(1.0, 2.5, 2.05, 2.000609756097561, 2.0000000929222
                                                  //| 947, 2.000000000000002, 2.0, 2.0, 2.0, 2.0)
  (sqrtStream(3) take 10).toList                  //> res2: List[Double] = List(1.0, 2.0, 1.75, 1.7321428571428572, 1.732050810014
                                                  //| 7274, 1.7320508075688772, 1.7320508075688772, 1.7320508075688772, 1.73205080
                                                  //| 75688772, 1.7320508075688772)

  def isGoodEnough(guess: Double, a: Double) = if (math.abs(guess * guess - a) / a < 0.01) true else false
                                                  //> isGoodEnough: (guess: Double, a: Double)Boolean
  sqrtStream(4) filter (isGoodEnough(_, 4))       //> res3: scala.collection.immutable.Stream[Double] = Stream(2.000609756097561, 
                                                  //| ?)
}