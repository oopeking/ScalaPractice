package week1

object tailRecursion {
  println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet

  //this is a tail recursion for factorial function;
  def factorial_withtailrec(x: Int): Int =
    {
      def loop(result: Int, index: Int): Int =
        {
          if (index == 0)
            result
          else
            loop(result * index, index - 1)
        }
      loop(1, x)
    } //> factorial_withtailrec: (x: Int)Int

  def factorial(x: Int): Int =
    if (x == 0) 1
    else
      x * factorial(x - 1) //> factorial: (x: Int)Int

  factorial(4) //> res0: Int = 24
  factorial_withtailrec(4) //> res1: Int = 24
}