package rockthejvm

import scala.annotation.tailrec

object RemoveKElement extends App {


  /*
   * Remove an element at given index 'k' and return a new list
   */
  def solution[V](k: Int, list: List[V]): List[V] = {

    @tailrec
    def recursiveCall(remainder: List[V], counter: Int, accumulator: List[V]): List[V] = {
      if (k > list.length) throw new IndexOutOfBoundsException("Index of out bound")
      else if (remainder.isEmpty) accumulator.reverse
      else if (k == counter) {
        recursiveCall(remainder.empty, counter+1, remainder.tail.reverse ::: accumulator)
      }
      else recursiveCall(remainder.tail, counter+1, remainder.head :: accumulator)
    }
    recursiveCall(list, counter = 0, List())
  }

  println(solution(2, (1 to 10).toList))
}
