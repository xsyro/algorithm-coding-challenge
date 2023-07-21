import org.scalatest.{Inside, Inspectors, OptionValues}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

abstract class UnitTestAbstract extends AnyFlatSpec with Matchers with OptionValues with Inside with Inspectors
