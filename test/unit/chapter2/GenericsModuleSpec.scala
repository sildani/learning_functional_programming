package chapter2

import collection.mutable.Stack
import org.scalatest._

/* Exercise 2.2 */
class GenericsModuleSpec extends FlatSpec with Matchers {

  "isSorted" should "detect if an array of any type is sorted, given a comparison function" in {
    def intComparator(n1: Int, n2: Int): Boolean = n1 < n2
    GenericsModule.isSorted(Array(5),     intComparator) should be (true)
    GenericsModule.isSorted(Array(1,2),   intComparator) should be (true)
    GenericsModule.isSorted(Array(1,2,3), intComparator) should be (true)
    GenericsModule.isSorted(Array(3,2,1), intComparator) should be (false)
    GenericsModule.isSorted(Array(2,1),   intComparator) should be (false)

    def strComparator(n1: String, n2: String): Boolean = n1 < n2
    GenericsModule.isSorted(Array("F"),         strComparator) should be (true)
    GenericsModule.isSorted(Array("A","B"),     strComparator) should be (true)
    GenericsModule.isSorted(Array("A","B","C"), strComparator) should be (true)
    GenericsModule.isSorted(Array("C","B","A"), strComparator) should be (false)
    GenericsModule.isSorted(Array("B","A"),     strComparator) should be (false)
  }

}