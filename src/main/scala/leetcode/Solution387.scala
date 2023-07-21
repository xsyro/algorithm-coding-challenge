package leetcode

import scala.annotation.tailrec

class Solution387 {

  /**
   * Given a string of @str, find the first non-repeating character in it and return its index.
   * If it does not exist, return -1
   *
   * @param str
   * @return
   */
  def firstUniqChar(str: String): Int = {
    val charArr = str.toCharArray

    @tailrec
    def uniqRemainTailRec(remainingItems: Seq[Char], currentItem: Char): Int = {
//      println(currentItem, remainingItems)
      if (!remainingItems.contains(currentItem))
        return charArr.indexOf(currentItem)
      uniqRemainTailRec(remainingItems.tail, remainingItems.head)
    }
    uniqRemainTailRec(charArr.tail, charArr.head)
  }


}
