package leetcode

import scala.annotation.tailrec
import scala.language.implicitConversions

object Solution1877 extends App {

  def minPairSum(nums: Array[Int]): Int = {

    //O(n) time complexity
    @tailrec
    def getPairs(remaining: List[Int], result: Vector[(Int, Int)], count: Int): Vector[(Int, Int)] = {
      if(remaining.isEmpty) result else {
        val (x,y) = (remaining.head, remaining.last)
        getPairs(remaining.tail.dropRight(1), (x,y) +: result, count+1)
      }
    }

    getPairs(nums.sorted.toList, Vector(), 1)
      .map(tuple => tuple._2 + tuple._1)
      .reduce((x, y) => x max y)
  }



  /*
   * Using one-line scala syntax power
   */
  def minPairSumSolution2(nums: Array[Int]): Int = (nums.sorted.reverse zip nums.sorted).map(n => n._1 + n._2).reduce((x, y) => x max y)

  println(minPairSumSolution2(Array(3, 5, 4, 2, 4, 6)))

}
