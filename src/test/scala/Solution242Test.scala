import api.UnitTestAbstract
import leetcode.Solution242

class Solution242Test extends UnitTestAbstract {

  lazy val solution242 = new Solution242()

  "A LeetCode isAnagram method" should "pass to ensure two strings are anagram" in  {
    assertResult(solution242.isAnagram("", ""))(actual = true)
    assertResult(solution242.isAnagram("anagram", "nagaram"))(actual = true)
  }

  "A LeetCode isAnagram method" should "fail to ensure two strings are not anagram" in {
    assertResult(solution242.isAnagram("cat", "rat"))(actual = false)
  }
}
