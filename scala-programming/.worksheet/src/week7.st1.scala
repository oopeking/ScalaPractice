package week7

object st1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
  val stream1 = Stream(1, 2, 3);System.out.println("""stream1  : scala.collection.immutable.Stream[Int] = """ + $show(stream1 ));$skip(13); val res$0 = 
  stream1(0);System.out.println("""res0: Int = """ + $show(res$0));$skip(13); val res$1 = 
  stream1(1);System.out.println("""res1: Int = """ + $show(res$1));$skip(13); val res$2 = 
  stream1(2);System.out.println("""res2: Int = """ + $show(res$2));$skip(67); 
  val stream11 = for {
    s <- stream1
    if (s > 3)
  } yield s;System.out.println("""stream11  : scala.collection.immutable.Stream[Int] = """ + $show(stream11 ));$skip(16); val res$3 = 
  stream11.size;System.out.println("""res3: Int = """ + $show(res$3));$skip(93); 
  if (stream11 == Stream.Empty) {
    print("Empty")
  }
  else {
    print("Non empty")
  };$skip(38); 
  val stream2 = (99 to 1000).toStream;System.out.println("""stream2  : scala.collection.immutable.Stream[Int] = """ + $show(stream2 ));$skip(13); val res$4 = 
  stream2(0);System.out.println("""res4: Int = """ + $show(res$4));$skip(68); 
  val stream3 = Stream.cons(10, Stream.cons(stream1, Stream.Empty));System.out.println("""stream3  : Stream.Cons[Any] = """ + $show(stream3 ));$skip(13); val res$5 = 
  stream3(0);System.out.println("""res5: Any = """ + $show(res$5));$skip(13); val res$6 = 
  stream3(1);System.out.println("""res6: Any = """ + $show(res$6));$skip(81); 
  def isPrime(x: Int): Boolean = {
    (2 to x - 1) forall (m => x % m != 0)
  };System.out.println("""isPrime: (x: Int)Boolean""");$skip(51); val res$7 = 
  //Stream use}
  ((10 to 1000) filter isPrime)(3);System.out.println("""res7: Int = """ + $show(res$7));$skip(54); 
  val primeSet = (10 to 1000).toStream filter isPrime;System.out.println("""primeSet  : scala.collection.immutable.Stream[Int] = """ + $show(primeSet ));$skip(14); val res$8 = 
  primeSet(3);System.out.println("""res8: Int = """ + $show(res$8));$skip(29); val res$9 = 
  (primeSet take 100).toList;System.out.println("""res9: List[Int] = """ + $show(res$9))}

  //Stream support nearly all operator of List, except  ::
  //x::xs always produce List, never a Stream
  //There is however an alternative operator #:: which produce Stream
  //x#::xs == Stream.cons(x,xs)
}
