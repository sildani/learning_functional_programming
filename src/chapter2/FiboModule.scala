package chapter2

object FiboModule {

  def fibo(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, acc1: Int, acc2: Int): Int = {
      if (n <= 1) acc1
      else go(n-1, acc2, acc1+acc2)
    }
    go(n, 0, 1)
  }

  // def fiboTest(m: Map): List = {
  //   // key: input, value: expected output

  // }

  def main(args: Array[String]): Unit =
    println(fibo(6))

}