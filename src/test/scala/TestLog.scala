import org.scalatest.funsuite.AnyFunSuite

class TestLog extends AnyFunSuite {
  val str = new LogClass

  test("Test LogClass") {
  val LogTest = str.log(Message1 = "Hello")
  assert(LogTest == "[ info] : Hello")
  }

}
