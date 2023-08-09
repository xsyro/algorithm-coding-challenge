package rockthejvm

object TypeClasses extends App {

  /**
   * HTML serialiser
   */
  trait HTMLSerializable[T] {
    def serializable(value: T): String
  }

  object HTMLSerializer {
    def apply[T](item: T)(implicit htmlSerializable: HTMLSerializable[T]): String = htmlSerializable.serializable(item)

  }


  implicit object StringSerializer extends HTMLSerializable[String] {
    override def serializable(value: String): String = ???
  }

  println(HTMLSerializer(""))


  /**
   * Equal TypeClass
   */
  trait Eq[X, Y] {
    def compare(x: X, y: Y): Int
  }

  object Eq {
    def apply[X, Y](x: X, y: Y)(implicit equality: Eq[X, Y]): Int = equality.compare(x, y)
  }


  object Implicit {
    implicit val nameEqualityCheckStrStr = new Eq[String, String] {
      override def compare(x: String, y: String): Int = if (!x.equalsIgnoreCase(y)) -1 else x.indexOf(y)
    }
  }

  import Implicit._

  println(Eq("helloxx", "hello"))
}
