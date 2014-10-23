package week5

object listFun4 {
  val list = 7 :: 1 :: (-9) :: 0 :: 4 :: 19 :: 23 :: Nil
                                                  //> list  : List[Int] = List(7, 1, -9, 0, 4, 19, 23)
  def sum(xs: List[Int]): Int = {
    0 :: xs reduceLeft ((x, y) => x + y)
  }                                               //> sum: (xs: List[Int])Int
  def product(xs: List[Int]): Int = {
    (xs foldLeft 1)((x, y) => x * y)
  }                                               //> product: (xs: List[Int])Int
  sum(list)                                       //> res0: Int = 45
  sum(List(99))                                   //> res1: Int = 99
  sum(List())                                     //> res2: Int = 0
  product(List(1, 2, 3, 4))                       //> res3: Int = 24

  def concat[T](xs: List[T], ys: List[T]): List[T] = {
    (xs foldRight ys)(_ :: _)
  }                                               //> concat: [T](xs: List[T], ys: List[T])List[T]
  concat(List(1, 23, -4), List(56, 34, 2))        //> res4: List[Int] = List(1, 23, -4, 56, 34, 2)
}