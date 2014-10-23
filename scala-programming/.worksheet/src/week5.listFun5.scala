package week5

object listFun5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(100); 
  def f1(xs: List[Int]): List[Int] = {
    xs map (x => x * 3)
  };System.out.println("""f1: (xs: List[Int])List[Int]""");$skip(71); 
  def isPrime(n: Int) = {
    (2 until n) forall (i => n % i != 0)
  };System.out.println("""isPrime: (n: Int)Boolean""");$skip(121); 
  def allPrimePair(n: Int)(implicit ord: Ordering[Int]) = {
    (2 until n) map (i => (1 until i) map (j => (i, j)))
  };System.out.println("""allPrimePair: (n: Int)(implicit ord: Ordering[Int])scala.collection.immutable.IndexedSeq[scala.collection.immutable.IndexedSeq[(Int, Int)]]""");$skip(55); val res$0 = 

  //zip
  List(1, 2, 3) zip List("a", "b", "c", "d");System.out.println("""res0: List[(Int, String)] = """ + $show(res$0));$skip(31); val res$1 = 
  //map
  f1(List(1, 2, 3, 4));System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(51); val res$2 = 
  //get all pair and use flatten
  allPrimePair(7);System.out.println("""res2: scala.collection.immutable.IndexedSeq[scala.collection.immutable.IndexedSeq[(Int, Int)]] = """ + $show(res$2));$skip(26); val res$3 = 
  allPrimePair(7).flatten;System.out.println("""res3: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$3));$skip(86); 
  //use flatmap
  val pair = (2 until 7) flatMap (i => (1 until i) map (j => (i, j)));System.out.println("""pair  : scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(pair ));$skip(93); val res$4 = 
  //use filter to get all pair whos sum is a prime
  pair filter (p => isPrime(p._1 + p._2));System.out.println("""res4: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$4))}
                                                  
}
