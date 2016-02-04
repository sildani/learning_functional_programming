package chapter2

/* Exercise 2.2 */
object GenericsModule {

  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int, lastResult: Boolean): Boolean = {
      if (n >= as.length || lastResult == false) lastResult
      else if (n == 0) loop(n+1, lastResult)
      else loop(n+1, ordered(as(n-1),as(n)))
    }
    loop(0, true)
  }

}