import scala.annotation.tailrec

class Factorial {

  def factorialNumberByRecursion (Number:Int) :Int= {
    if (Number <= 1) {
      1
    }
    else {
      Number * factorialNumberByRecursion(Number-1)
    }
  }


  def factorialNumberByTailRecursion (Number:Int): Int = {
    @tailrec
    def factorialAcc(acc:Int,Number:Int): Int = {
      if (Number <= 1){
        acc
      }
      else {
        factorialAcc(Number*acc,Number-1)
      }
    }
    factorialAcc(1,Number)
  }
}
