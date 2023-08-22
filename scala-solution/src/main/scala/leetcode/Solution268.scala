package leetcode

object Solution268 extends App {

  /**
   * Given an array nums containing n distinct numbers in the range [0, n],
   * return the only number in the range that is missing from the array.
   * @param nums
   * @return
   */
  def missingNumber(nums: Array[Int]): Int = {
    val newNums = for(i <- 0 to nums.length) yield i
    newNums.dropWhile(i => nums.contains(i)).head
  }


}
