object positive extends App:
  val positive: Int =>String = _ match
   case n if n>0 => "positive"
   case n if n<0 => "negative"


  def positive(n:Int):String= n match
    case n if n>0 => "positive"
    case n if n<0 => "negative"


 // scala> neg(a=>true) ("ciao")
  //val res1: Boolean = false

//scala> neg(i=> false) ("b")
//val res2: Boolean = true

  //def neg2(a: Boolean): Boolean = !a
  
  //val foo: String => Boolean = a => true
