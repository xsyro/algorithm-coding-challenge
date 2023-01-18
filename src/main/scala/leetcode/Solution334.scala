package leetcode

object Solution334 extends App {


  def reverseString(s: Array[Char]): Unit = {
    var left: Int = 0
    var right: Int = s.length-1
    while (left <= right) {
      val tmp = s(left)
      s(left) = s(right)
      s(right) = tmp
      left += 1
      right -= 1
    }
  }

  reverseString(Array('h', 'e', 'l', 'l', 'o'))
}
