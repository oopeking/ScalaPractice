package week2

object currying {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  //Part 1
  def product(f: Int => Int)(a: Int, b: Int): Int =
    {
      if (a > b) 1
      else
        f(a) * product(f)(a + 1, b)
    }                                             //> product: (f: Int => Int)(a: Int, b: Int)Int
  def fact(n: Int) = product(x => x)(1, n)        //> fact: (n: Int)Int
  def fact2(m: Int, n: Int) = product(x => x)(m, n)
                                                  //> fact2: (m: Int, n: Int)Int
  product(x => x * x)(3, 4)                       //> res0: Int = 144
  product(x => x * x)(3, 5)                       //> res1: Int = 3600
  fact(5)                                         //> res2: Int = 120
  fact2(1, 3)                                     //> res3: Int = 6

  //Part2
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int = {
    if (a > b) zero
    else
      combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
  }                                               //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int
  def product2(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x * y, 1)(a, b)
                                                  //> product2: (f: Int => Int)(a: Int, b: Int)Int
  product2(x => x * x)(3, 4)                      //> res4: Int = 144
  def fact3(a: Int, b: Int) = product2(x => x)(a, b)
                                                  //> fact3: (a: Int, b: Int)Int

}