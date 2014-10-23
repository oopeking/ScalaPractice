package week7

object st3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(231); 
  //sqrtRoot
  def sqrtStream(x: Double): Stream[Double] = {
    def improve(guess: Double) = (guess + (x / guess)) / 2
    lazy val guesses: Stream[Double] = 1 #:: (guesses map improve)
    guesses
  };System.out.println("""sqrtStream: (x: Double)Stream[Double]""");$skip(16); val res$0 = 
  sqrtStream(4);System.out.println("""res0: Stream[Double] = """ + $show(res$0));$skip(33); val res$1 = 
  (sqrtStream(4) take 10).toList;System.out.println("""res1: List[Double] = """ + $show(res$1));$skip(33); val res$2 = 
  (sqrtStream(3) take 10).toList;System.out.println("""res2: List[Double] = """ + $show(res$2));$skip(109); 

  def isGoodEnough(guess: Double, a: Double) = if (math.abs(guess * guess - a) / a < 0.01) true else false;System.out.println("""isGoodEnough: (guess: Double, a: Double)Boolean""");$skip(44); val res$3 = 
  sqrtStream(4) filter (isGoodEnough(_, 4));System.out.println("""res3: scala.collection.immutable.Stream[Double] = """ + $show(res$3))}
}
