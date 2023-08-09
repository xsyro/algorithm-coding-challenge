package rockthejvm

import scala.annotation.tailrec

object RunLengthEncoding extends App {

  /*
   * count consecutive duplicate and return them in a list of tuple
   */
//  def solution(items: List[Int]): List[(Int, Int)] = {
//    val sortedItems = items.sortWith((x, y) => x < y)
//
//    @tailrec
//    def recursion(remaining: List[Int], item: Int, accumulator: List[(Int, Int)]): List[(Int, Int)] = {
//      if (remaining.isEmpty)
//        accumulator.reverse
//      else if (item != remaining.head)
//        recursion(remaining.tail, item, (item, 1) :: accumulator)
//      else {
//        recursion()
//      }
//    }
//
//    recursion(sortedItems.tail, sortedItems.head, List())
//  }

//  println(solution(List(1, 1, 1, 2, 2, 1, 3, 4, 3, 4, 4, 3, 5, 5, 5, 4, 6, 2, 2, 4, 6, 6, 6)))
}
