package chapter2

import collection.mutable.Stack
import org.scalatest._

/* Exercise 2.1 */
class FiboModuleSpec extends FlatSpec with Matchers {

  "Fibo" should "return the nth Fibonacci number" in {
    FiboModule.fibo(1) should be (0)
    FiboModule.fibo(2) should be (1)
    FiboModule.fibo(3) should be (1)
    FiboModule.fibo(4) should be (2)
    FiboModule.fibo(5) should be (3)
    FiboModule.fibo(6) should be (5)
  }

}