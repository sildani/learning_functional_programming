package chapter2

/* no unit tests because it just has to compile */
object CurryModule {

  /* Exercise 2.3 */
  def curry[A,B,C](f: (A, B) => C): A => (B => C) = {
    (a: A) => ((b: B) => f(a, b))
  }

  /* Exercise 2.4 */
  def uncurry[A,B,C](f: A => (B => C)): (A, B) => C = {
    (a: A, b: B) => (f(a))(b)
  }

  /* Exercise 2.5 */
  def compose[A,B,C](f: B => C, g: A => B): A => C = {
    (a: A) => f(g(a))
  }

}