package leetcode

object Solution345 extends App {

  def reverseVowels(s: String): String = {
    val vowels = Array('a', 'e', 'i', 'o', 'u')
    val chars = s.toLowerCase.toCharArray
    var left: Int = 0
    var right: Int = s.length-1
    while (left <= right) {
      val tmp = chars(left)
//      if(vowels.contains(tmp)) {
        chars(left) = s(right)
        chars(right) = tmp
//      }
      left += 1
      right -= 1
    }
    new String(chars)

  }

  println(reverseVowels("hello"))

}
