package week2

object higherOrderFun {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def sum(f: Int => Int, a: Int, b: Int): Int = {
    if (a > b) 0 else { f(a) + sum(f, a + 1, b) }
  }                                               //> sum: (f: Int => Int, a: Int, b: Int)Int

  //we could just use x=>x*x*x to present this function, rather than a def;
  def cube(x: Int): Int = {
    x * x * x
  }                                               //> cube: (x: Int)Int

  //need to implement the function body correctly
  def factorial(x: Int): Int = {
    0
  }                                               //> factorial: (x: Int)Int

  def sumInt(a: Int, b: Int) = sum(x => x, a, b)  //> sumInt: (a: Int, b: Int)Int

  def sumFactorial(a: Int, b: Int) = sum(x => factorial(x), a, b)
                                                  //> sumFactorial: (a: Int, b: Int)Int

  def sumCube(a: Int, b: Int): Int = sum(x => x * x * x, a, b)
                                                  //> sumCube: (a: Int, b: Int)Int

}