package week2

object functionsReturnFunctions {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  //This function would return another function
  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int = {
      if (a > b) 0 else { f(a) + sumF(a + 1, b) }
    }
    sumF
  }                                               //> sum: (f: Int => Int)(Int, Int) => Int

  sum(x => x * x)(1, 2)                           //> res0: Int = 5
  sum(x => x * x)(1, 3)                           //> res1: Int = 14
  sum(x => x * x * x)(1, 10)                      //> res2: Int = 3025
}