import org.scalatest.funsuite.AnyFunSuite

class FactorialTest extends AnyFunSuite{
 val factorianNumber = new Factorial

  test("Test Factorial Number"){
   val facNum = factorianNumber.factorialNumberByRecursion(5)
   assert(facNum == 120)
  }

 test ("Test Factorial Number For 0"){
  val facNum = factorianNumber.factorialNumberByRecursion(0)
  assert(facNum == 1)
 }

 test("Test Factorial Number For 1"){
  val facNum = factorianNumber.factorialNumberByRecursion(1)
  assert(facNum == 1)
 }

 test("Test Factorial Number by tail recursion "){
  val facNum = factorianNumber.factorialNumberByTailRecursion(5)
  assert(facNum == 120)
 }

 test("Test Factorial Number For Zero by tail recursion "){
  val facNum = factorianNumber.factorialNumberByTailRecursion(0)
  assert(facNum == 1)
 }
 test("Test Factorial Number For 1 by tail recursion "){
  val facNum = factorianNumber.factorialNumberByTailRecursion(1)
  assert(facNum == 1)
 }


}
