package week7

object st2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(168); 
  def expr = {
    def z = { print("z"); 3 }
    val x = { print("x"); 1 }
    lazy val y = { print("y"); 2 }
    z + y + x + z + y + x
  };System.out.println("""expr: => Int""");$skip(7); val res$0 = 
  expr;System.out.println("""res0: Int = """ + $show(res$0));$skip(75); 

  //Infinite Streams
  def from(n: Int): Stream[Int] = n #:: from(n + 1);System.out.println("""from: (n: Int)Stream[Int]""");$skip(20); 
  val nat = from(0);System.out.println("""nat  : Stream[Int] = """ + $show(nat ));$skip(34); 
  val nat1 = nat map (x => x + 4);System.out.println("""nat1  : scala.collection.immutable.Stream[Int] = """ + $show(nat1 ));$skip(29); 
  val nat2 = nat map (_ * 4);System.out.println("""nat2  : scala.collection.immutable.Stream[Int] = """ + $show(nat2 ));$skip(10); val res$1 = 
  nat1(0);System.out.println("""res1: Int = """ + $show(res$1));$skip(10); val res$2 = 
  nat1(2);System.out.println("""res2: Int = """ + $show(res$2));$skip(25); val res$3 = 
  (nat1 take 100).toList;System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(10); val res$4 = 
  nat2(3);System.out.println("""res4: Int = """ + $show(res$4));$skip(16); val res$5 = 
  nat2 take 100;System.out.println("""res5: scala.collection.immutable.Stream[Int] = """ + $show(res$5));$skip(73); 
  def filterTest(xs: List[Int]): List[Int] = {
    xs filter (_ > 0)
  };System.out.println("""filterTest: (xs: List[Int])List[Int]""");$skip(40); val res$6 = 
  filterTest(List(1, -4, 34, 0, 29, 8));System.out.println("""res6: List[Int] = """ + $show(res$6));$skip(131); 

  //Sieve of Eratosthenes
  def sieve(s: Stream[Int]): Stream[Int] = {
    s.head #:: sieve(s.tail filter (_ % s.head != 0))
  };System.out.println("""sieve: (s: Stream[Int])Stream[Int]""");$skip(26); val res$7 = 
  sieve(from(2)) take 100;System.out.println("""res7: scala.collection.immutable.Stream[Int] = """ + $show(res$7));$skip(52); 

  //Which one gernate Stream faster?
  val N = 10;System.out.println("""N  : Int = """ + $show(N ));$skip(47); val res$8 = 
  (from(1) filter (_ % N == 0) take 10 toList);System.out.println("""res8: List[Int] = """ + $show(res$8));$skip(37); val res$9 = 
  from(1) map (_ * 10) take N toList;System.out.println("""res9: List[Int] = """ + $show(res$9))}
}
