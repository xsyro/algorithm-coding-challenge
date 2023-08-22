package leetcode

object Solution509 extends App {

  def fib(n: Int): Int = {
    if (n < 2) return n
    fib(n - 1) + fib(n - 2)
  }
  println(fib(1))


}
