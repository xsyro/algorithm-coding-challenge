package leetcode

import java.util
import scala.annotation.tailrec

object Solution217 extends App {

  //Works! However, not efficient algorithm for large dat
  def containsDuplicateUsingRecursion(nums: Array[Int]): Boolean = {
    @tailrec
    def tailRecCheck(remaining: Array[Int], item: Int, result: Boolean): Boolean = {
      if (remaining.contains(item)) return true
      if (remaining.isEmpty) result else tailRecCheck(remaining.tail, remaining.head, remaining.tail.contains(remaining.head))
    }

    tailRecCheck(nums.tail, nums.head, result = false)
  }

  //More efficient solution
  def containsDuplicateUsingHashSet(nums: Array[Int]): Boolean = {
    var result = false;
    nums.foldLeft(scala.collection.mutable.Set[Int]()) { (item, n) =>
      if (!item.contains(n)) item.add(n) else {
        result = true;
      }
      item
    }
    result
  }

  //More efficient solution
  def containsDuplicateUsingSorting(nums: Array[Int]): Boolean = {
    util.Arrays.sort(nums)
    for (i <- 0 until nums.length - 1) {
      if(nums(i) == nums(i+1)) return true
    }
    false
  }


  println(containsDuplicateUsingSorting(Array(1,2,3,4,1)))
}
