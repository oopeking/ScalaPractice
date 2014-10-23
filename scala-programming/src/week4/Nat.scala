package week4

//non negative number
abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat = new Succ(this)
  def +(that: Nat): Nat
  def -(that: Nat): Nat
}

//implement a sub-object
object Zero extends Nat {
  def isZero = true
  //remember we could throw error
  def predecessor: Nat = throw new Error("0.predecessor.")
  def +(that: Nat): Nat = that
  def -(that: Nat): Nat = if (that.isZero) this else throw new Error("negative number")
}

//implement a sub-class
class Succ(n: Nat) extends Nat {
  def isZero = false
  def predecessor: Nat = n
  //try to consider the n+that expression hereby
  def +(that: Nat): Nat = new Succ(n + that)
  //we must consider situation that that is larger that this
  //so we give up expression like new Succ(n-that) hereby
  def -(that: Nat): Nat = if (that.isZero) this else n - that.predecessor
}