package leetcode

object Solution1528 extends App {

  def restoreString(s: String, indices: Array[Int]): String = {
    val chars = s.toCharArray.toSeq
    new String(indices.map(c => chars(c)))
  }

  println(restoreString("codeleet", Array(4,5,6,7,0,2,1,3)))
}
