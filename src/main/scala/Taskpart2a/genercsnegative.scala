package Taskpart2a

object genercsnegative extends App :

  def neg[A] (pred: A=> Boolean) : A=>Boolean = a => !pred(a)

