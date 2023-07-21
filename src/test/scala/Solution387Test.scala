import leetcode.Solution387
import org.scalatest._

class Solution387Test extends UnitTestAbstract {

  /**
   * Test Cases
   */
  "A method" should "find the first unique character" in {
    val solution387 = new Solution387()
    assert(solution387.firstUniqChar("leetcode") == 0)
    assert(solution387.firstUniqChar("loveleetcode") == 2)
    assert(solution387.firstUniqChar("aabb") == -1)
  }
}
