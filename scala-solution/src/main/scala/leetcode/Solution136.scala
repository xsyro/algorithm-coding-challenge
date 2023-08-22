package leetcode


/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 */
object Solution136 extends App{

  def singleNumber(nums: Array[Int]): Int = {

    def findNonDuplicate(remaining: Array[Int], currentItem: Int): Int = {
//      if()
      if(remaining.isEmpty) currentItem else {
        findNonDuplicate(remaining.tail, remaining.head)
      }
    }
    findNonDuplicate(nums.tail, nums.head)
  }

  singleNumber(Array(2,2,1))
}
