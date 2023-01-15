package leetcode

import scala.annotation.tailrec

object Solution217 extends App {

  //Works! However, not efficient algorithm for large dat
  def containsDuplicateComplex(nums: Array[Int]): Boolean = {
    @tailrec
    def tailRecCheck(remaining: Array[Int], item: Int, result: Boolean): Boolean = {
      if (remaining.contains(item)) return true
      if (remaining.isEmpty) result else tailRecCheck(remaining.tail, remaining.head, remaining.tail.contains(remaining.head))
    }

    tailRecCheck(nums.tail, nums.head, result = false)
  }


  //More efficient solution
  def containsDuplicate(nums: Array[Int]): Boolean = {
    var result = false;
    nums.foldLeft(scala.collection.mutable.Set[Int]()) { (item, n) =>
      if (!item.contains(n)) item.add(n) else {
        result = true;
      }
      item
    }
    result
  }


  println(containsDuplicate(Array(1, 2, 3, 1)))
}
