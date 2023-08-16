package leetcode

class Solution242 {


  /**
   * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
   *
   * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
   * typically using all the original letters exactly once.
   *
   * @param s
   * @param t
   * @return
   */
  def isAnagram(s: String, t: String): Boolean = {
    val sArr = s.toCharArray.toSeq.sorted
    if (s.length != t.length) return false
    val mapOfSStr = sArr.foldLeft(scala.collection.mutable.Map.empty[Char, Int])((map, item) => map += (item -> s.count(_ == item))).toMap
    val unmatchedChar = mapOfSStr.dropWhile(tuple2 => {
      val (currentChar, count) = tuple2
      count == t.count(_ == currentChar)
    })
    unmatchedChar.isEmpty
  }

}
