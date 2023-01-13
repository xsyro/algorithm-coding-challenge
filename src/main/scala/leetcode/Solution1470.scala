package leetcode

import scala.annotation.tailrec

object Solution1470 extends App {


  def shuffle(nums: Array[Int], n: Int): Array[Int] = {
    val (x, y) = nums.zipWithIndex.partition(_._2 < n)

    @tailrec
    def joinItems(left: Array[Int], right: Array[Int], result: List[Int]): List[Int] = {
      if (left.isEmpty || right.isEmpty) result else {
        joinItems(left.tail, right.tail, left.head :: right.head :: result)
      }
    }

    joinItems(x.map(_._1).reverse, y.map(_._1).reverse, List()).toArray
  }


  println(shuffle(Array(2, 5, 1, 3, 4, 7), 3).mkString(","))
}
