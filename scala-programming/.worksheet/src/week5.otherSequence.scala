package week5

object otherSequence {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(214); 
  //Array and String are both support the same operations as Seq
  //But they can't be subclasses of Seq as they come from Java
  //Array
  val xs: Array[Int] = Array(1, 2, 3);System.out.println("""xs  : Array[Int] = """ + $show(xs ));$skip(22); val res$0 = 
  xs map (x => x + 2);System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(47); 

  //String
  val ys: String = "Hello World!";System.out.println("""ys  : String = """ + $show(ys ));$skip(8); val res$1 = 
  ys(1);System.out.println("""res1: Char = """ + $show(res$1));$skip(8); val res$2 = 
  ys(2);System.out.println("""res2: Char = """ + $show(res$2));$skip(24); val res$3 = 
  ys filter (_.isUpper);System.out.println("""res3: String = """ + $show(res$3));$skip(36); 

  //Range
  val r: Range = 1 to 5;System.out.println("""r  : Range = """ + $show(r ));$skip(27); 
  val s: Range = 1 until 5;System.out.println("""s  : Range = """ + $show(s ));$skip(15); val res$4 = 
  1 to 11 by 3;System.out.println("""res4: scala.collection.immutable.Range = """ + $show(res$4));$skip(16); val res$5 = 
  10 to 0 by -2;System.out.println("""res5: scala.collection.immutable.Range = """ + $show(res$5));$skip(56); val res$6 = 

  //More Sequence Operations
  xs exists (x => x > 2);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(25); val res$7 = 
  xs forall (x => x > 2);System.out.println("""res7: Boolean = """ + $show(res$7));$skip(24); val res$8 = 
  ys exists (_.isUpper);System.out.println("""res8: Boolean = """ + $show(res$8));$skip(24); val res$9 = 
  ys forall (_.isUpper);System.out.println("""res9: Boolean = """ + $show(res$9));$skip(24); 
  val pairs = xs zip ys;System.out.println("""pairs  : Array[(Int, Char)] = """ + $show(pairs ));$skip(14); val res$10 = 
  pairs.unzip;System.out.println("""res10: (scala.collection.mutable.IndexedSeq[Int], scala.collection.mutable.IndexedSeq[Char]) = """ + $show(res$10));$skip(33); val res$11 = 
  ys flatMap (x => List('.', x));System.out.println("""res11: String = """ + $show(res$11));$skip(9); val res$12 = 
  xs.sum;System.out.println("""res12: Int = """ + $show(res$12));$skip(13); val res$13 = 
  xs.product;System.out.println("""res13: Int = """ + $show(res$13));$skip(9); val res$14 = 
  xs.max;System.out.println("""res14: Int = """ + $show(res$14));$skip(9); val res$15 = 
  xs.min;System.out.println("""res15: Int = """ + $show(res$15));$skip(160); 

  //implement a inner product of two vectors
  def scalaProduct(xs: Vector[Double], ys: Vector[Double]) = {
    (xs.zip(ys)).map(xy => xy._1 * xy._2).sum
  };System.out.println("""scalaProduct: (xs: Vector[Double], ys: Vector[Double])Double""");$skip(50); val res$16 = 
  scalaProduct(Vector(1, 4, 2), Vector(-3, 0, 9));System.out.println("""res16: Double = """ + $show(res$16));$skip(118); 

  //Judge whether a number is prime
  def isPrime(n: Int): Boolean = {
    (2 until n) forall (x => n % x != 0)
  };System.out.println("""isPrime: (n: Int)Boolean""")}
}
