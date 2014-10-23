package week5
import week5._

object listFun6 {
  val persons = List(new Person("chao", 28), new Person("xiao", 16), new Person("ling", 21), new Person("fang", 23))
                                                  //> persons  : List[week5.Person] = List(chao/28, xiao/16, ling/21, fang/23)
  //First for-expression example
  persons filter (p => p.a > 20) map (p => p.n)   //> res0: List[String] = List(chao, ling, fang)
  //Second for-expression example:for-yield
  for (p <- persons if p.a > 20) yield p.n        //> res1: List[String] = List(chao, ling, fang)
  for (p <- persons) yield p.n                    //> res2: List[String] = List(chao, xiao, ling, fang)

  def isPrime(n: Int) = {
    (2 until n) forall (i => n % i != 0)
  }                                               //> isPrime: (n: Int)Boolean
  //Another exampe of for-yield
  val n = 7                                       //> n  : Int = 7
  for {
    i <- 1 until n
    j <- 1 until i
    if (isPrime(i + j))
  } yield (i, j)                                  //> res3: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2), (6,1), (6,5))
}

class Person(name: String, age: Int) {
  val a = age
  val n = name
  override def toString = {
    name + "/" + age
  }
}