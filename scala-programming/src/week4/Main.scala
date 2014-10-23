package week4

object Main extends App {
  println("Pascal's Triangle")
  val expr0 = new Number(12)
  val expr1 = new Number(31)
  val expr2 = new Number(100)
  val expr3 = new Sum(expr0, expr1)
  val expr4 = new Sum(expr2, expr3)

  println(expr0.evalWithCaseClass)
  println(expr1.evalWithCaseClass)
  println(expr2.evalWithCaseClass)
  println(expr3.evalWithCaseClass)
  println(expr4.evalWithCaseClass)
  println()

  println(expr0.show)
  println(expr1.show)
  println(expr2.show)
  println(expr3.show)
  println(expr4.show)

}

abstract class Expr {
  //classification
  def isNumber: Boolean
  def isSum: Boolean
  def isProd: Boolean
  def isVar: Boolean

  //Accessor
  def numValue: Int
  def leftOp: Expr
  def rightOp: Expr

  def eval: Int = {
    if (this.isNumber) this.numValue
    else if (this.isSum) {
      this.leftOp.eval + this.rightOp.eval
    } else {
      throw new Error("unkown expression")
    }
  }

  //Another way to implement the eval method
  def evalWithInstanceOf: Int = {
    if (this.isInstanceOf[Number]) {
      this.asInstanceOf[Number].numValue
    } else if (this.isInstanceOf[Sum]) {
      this.leftOp.evalWithInstanceOf + this.rightOp.evalWithInstanceOf
    } else {
      throw new Error("No such class")
    }
  }

  //Use case class to implement the same funcation of eval
  def evalWithCaseClass: Int = this match {
    case Number(n) => n
    case Sum(e1, e2) => e1.evalWithCaseClass + e2.evalWithCaseClass
  }

  def show: String = this match {
    case Number(n) => n.toString
    case Sum(e1, e2) => e1.show + " + " + e2.show
  }

}

case class Number(n: Int) extends Expr {
  def isNumber = true
  def isSum = false
  def isProd = false
  def isVar = false
  def numValue = n
  def leftOp = throw new Error("Number has no left")
  def rightOp = throw new Error("Number has no right")
}

case class Sum(left: Expr, right: Expr) extends Expr {
  def isNumber = false
  def isSum = true
  def isProd = false
  def isVar = false
  def numValue = throw new Error("Sum has no num value")
  def leftOp = left
  def rightOp = right
}

class Prod(e1: Expr, e2: Expr) extends Expr {
  def isNumber = false
  def isSum = false
  def isProd = true
  def isVar = false
  def numValue = throw new Error("Prod has no num value")
  def leftOp = e1
  def rightOp = e2
}
//
//class Var(str: String) extends Expr {
//
//}