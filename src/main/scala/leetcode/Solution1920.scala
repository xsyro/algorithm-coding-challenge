package leetcode

import scala.annotation.tailrec

object Solution1920 extends App {

  /*
   * Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
   * A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
   */
  def buildArray(nums: Array[Int]): Array[Int] = nums.zipWithIndex.map(x => nums(x._1))

  println(buildArray(Array(5, 0, 1, 2, 3, 4)).mkString(","))
}
