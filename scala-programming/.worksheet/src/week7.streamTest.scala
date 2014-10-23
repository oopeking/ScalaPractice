package week7

object StreamTest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(66); 
  val stream1 = Stream(1, 2, 3);System.out.println("""stream1  : scala.collection.immutable.Stream[Int] = """ + $show(stream1 ));$skip(13); val res$0 = 
  stream1(0);System.out.println("""res0: Int = """ + $show(res$0));$skip(13); val res$1 = 
  stream1(1);System.out.println("""res1: Int = """ + $show(res$1));$skip(13); val res$2 = 
  stream1(2);System.out.println("""res2: Int = """ + $show(res$2));$skip(38); 
  val stream2 = (99 to 1000).toStream;System.out.println("""stream2  : scala.collection.immutable.Stream[Int] = """ + $show(stream2 ));$skip(13); val res$3 = 
  stream2(0);System.out.println("""res3: Int = """ + $show(res$3));$skip(68); 
  val stream3 = Stream.cons(10, Stream.cons(stream1, Stream.Empty));System.out.println("""stream3  : Stream.Cons[Any] = """ + $show(stream3 ));$skip(13); val res$4 = 
  stream3(0);System.out.println("""res4: Any = """ + $show(res$4));$skip(13); val res$5 = 
  stream3(1);System.out.println("""res5: Any = """ + $show(res$5));$skip(81); 
  def isPrime(x: Int): Boolean = {
    (2 to x - 1) forall (m => x % m == 0)
  };System.out.println("""isPrime: (x: Int)Boolean""")}
  //Stream use
}
