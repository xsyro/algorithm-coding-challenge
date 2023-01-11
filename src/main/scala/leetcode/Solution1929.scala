package leetcode

/*
 * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * Specifically, ans is the concatenation of two nums arrays.
 *
 * Return the array ans.
 */
object Solution1929 extends App {

  def getConcatenation(nums: Array[Int]): Array[Int] = {
    List(nums).flatMap(x => x :: List(nums)).flatten.toArray
  }
  println(getConcatenation(Array(1,2,1)).mkString(","))


}
