package leetcode

import scala.annotation.tailrec

object Solution551 extends App {


  def solution(number: Array[Long]): Array[Long] = {
//    number.foldLeft(scala.collection.mutable.Map[Long, Int]()){ (map, item) =>
//      map.get(item) match {
//        case Some(value) => map.put(item, value+1)
//        case None => map.add(item, 1)
//      }
//    }
    number
  }

  def checkRecord(s: String): Boolean = {

    //
    //    val chars = s.toCharArray
    //
    //    def absentCheck(char: => Array[Char]): Boolean = {
    //
    //    }
    //
    //    def lateCheck(char: => Array[Char]): Boolean = {
    //
    //    }


    //    absentCheck(chars) && lateCheck(chars)

    true
  }

  val r = checkRecord("PPAALLALLL")
  println(r)
}
