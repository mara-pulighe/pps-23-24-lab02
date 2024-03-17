package Taskpart2b

object functionalcompositions {
  def compose(f: (Int => Int), g: (Int => Int)): Int => Int = i => f(g(i))
  def composeG [A](f: (A => A), g: (A => A)): A => A = i => f(g(i))
}
