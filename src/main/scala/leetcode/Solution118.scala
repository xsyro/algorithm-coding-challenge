package leetcode

import scala.annotation.tailrec

object Solution118 extends App{
  def generate(numRows: Int): List[List[Int]] = {
    @tailrec
    def pascalTriangle(remaining: Int ): List[List[Int]] = {
      pascalTriangle(remaining)
    }

    Nil

  }

  println(generate(4))
}
