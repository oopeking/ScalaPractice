package week3

import week2.RealNumber

object scratch {
  //Please note the return type
  new RealNumber(2, 3)                            //> res0: week2.RealNumber = 2/3
  def error(message: String) = throw new Error(message)
                                                  //> error: (message: String)Nothing
  val x = null                                    //> x  : Null = null

  if (true) 1 else false                          //> res1: AnyVal = 1
}