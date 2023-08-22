package leetcode

class Solution142 {

  def isPalindrome(s: String): Boolean = {
    val cleanStr = s.replaceAll("[^\\w][^\\d]", "").toLowerCase.trim
    cleanStr.foldRight()

  }

}
