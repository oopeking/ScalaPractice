package week5
import week5._

object listFun6 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(165); 
  val persons = List(new Person("chao", 28), new Person("xiao", 16), new Person("ling", 21), new Person("fang", 23));System.out.println("""persons  : List[week5.Person] = """ + $show(persons ));$skip(81); val res$0 = 
  //First for-expression example
  persons filter (p => p.a > 20) map (p => p.n);System.out.println("""res0: List[String] = """ + $show(res$0));$skip(87); val res$1 = 
  //Second for-expression example:for-yield
  for (p <- persons if p.a > 20) yield p.n;System.out.println("""res1: List[String] = """ + $show(res$1));$skip(31); val res$2 = 
  for (p <- persons) yield p.n;System.out.println("""res2: List[String] = """ + $show(res$2));$skip(73); 

  def isPrime(n: Int) = {
    (2 until n) forall (i => n % i != 0)
  };System.out.println("""isPrime: (n: Int)Boolean""");$skip(44); 
  //Another exampe of for-yield
  val n = 7;System.out.println("""n  : Int = """ + $show(n ));$skip(87); val res$3 = 
  for {
    i <- 1 until n
    j <- 1 until i
    if (isPrime(i + j))
  } yield (i, j);System.out.println("""res3: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$3))}
}

class Person(name: String, age: Int) {
  val a = age
  val n = name
  override def toString = {
    name + "/" + age
  }
}
