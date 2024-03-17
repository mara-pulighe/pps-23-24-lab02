package Taskpart3

object gcd {
  def  gcd(a: Int, b: Int): Int = (a,b) match
   case (a, b) if b == 0 => a
   case  (a,b) if a>b => gcd(b, a%b)
   case  _ => gcd(a, a%b)
}

//è tail perchè fornisce subito il risultato e non fa altre operzioni dopo gcd