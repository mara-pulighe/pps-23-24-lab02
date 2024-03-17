package Taskpart2a

import org.junit.Test
import org.junit.Assert.*
import Taskpart2a.genercsnegative
import Taskpart2a.genercsnegative.neg


class genericsnegativeTest: 
    import Taskpart2a.genercsnegative

    @Test def testvaluefromtrue(): Unit =
     assertEquals(false, neg(a=>true) ("ciao"))

    @Test def testvaluefromfalse(): Unit = 
      assertEquals(true, neg(a=>false) ("ok"))