package leetcode

object Solution2011 extends App {

  def finalValueAfterOperations(operations: Array[String]): Int = {
    operations.map(_.replaceAll("X", ""))
      .foldLeft(0)((x, y) => y match {
        case "++" => x + 1
        case "--" => x - 1
      })
  }

  println(finalValueAfterOperations(Array("--X","X++","X++")))

}
