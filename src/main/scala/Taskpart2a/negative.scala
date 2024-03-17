package Taskpart2a

object negative extends App :
    
 def neg (pred: String => Boolean) : String=>Boolean = (a: String) => !pred(a)

 val neg1 : (i:String => Boolean)=> (String=>Boolean) = f=> (a => !f(a))

