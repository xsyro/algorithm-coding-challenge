package leetcode

object Solution1773 extends App {

  sealed case class Item(`type`: String, color: String, name: String)

  def countMatches(items: List[List[String]], ruleKey: String, ruleValue: String): Int = {
    items.map(x => Item(x.head, x(1), x.last)).count(x => ruleKey match {
      case "type" => ruleValue.equals(x.`type`)
      case "color" => ruleValue.equals(x.color)
      case "name" => ruleValue.equals(x.name)
    })
  }


  print(countMatches( List(List("phone","blue","pixel"),List("computer","silver","phone"),List("phone","gold","iphone")), ruleKey = "type", ruleValue = "phone"))
}
