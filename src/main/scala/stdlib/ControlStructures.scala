package stdlib

import java.util.Date

import org.scalatest._

/** @param name control_structures
  *
  */
object ControlStructures extends FlatSpec with Matchers with org.scalaexercises.definitions.Section {

  /** Scala supports most of the control structures that we know from other languages.
    *
    * {{{
    * if (collection.isEmpty) {
    *    println("The collection is empty")
    * }
    * }}}
    *
    * In contrast to other languages, Scala's conditional is an expression:
    */
  def simpleIf(res0: String) {
    val isSameAsInJava =
      if('A' == 65) {
        "Yes, ASCII table is the same"
      } else {
        "Oh, that was unexpected"
      }

    isSameAsInJava should be(res0)
  }

  /** You can have as many else-if blocks as you want
    */
  def friendlyGreeter(res0: Int, res1: String) {
    val hourOfDay = res0
    val greeting =
      if(hourOfDay < 9)
        "Have a good morning!"
      else if (hourOfDay < 16)
        "Have a nice day!"
      else if (hourOfDay <= 22)
        "Have a nice evening!"
      else
        "Have a good night!"

    greeting should be(res1)
  }

  /** while and do-while are statements (they return Unit):
    */
  def whileLoop(res0: Int, res1: Int) {
    var i = 5
    var accumulator = 1
    while (i > 1) {
      accumulator *= i
      i -= res0 // there's no -- or ++ in Scala!
    }

    accumulator should be(res1)
  }

  /** For-loops are much more powerful in Scala, but let's start
    * with a simple one:
    */
  def simpleFor(res0: Int) {
    var accumulator = 1
    for( i <- 2 to 5){
       accumulator *= i
    }
    accumulator should be(res0)
  }

  /** A for-loop can also range over multiple variables:

    {{{
      for (a <- 1 to 2; b <- 1 to 2) {
        println("Value of a: " + a)
        println("Value of b: " + b)
      }
    }}}

    This will print
    {{{
      Value of a: 1
      Value of b: 1
      Value of a: 1
      Value of b: 2
      Value of a: 2
      Value of b: 1
      Value of a: 2
      Value of b: 2
    }}}

    Additionally, a filter can be specified
    {{{
      for (i <- 1 to 10 if i % 2 == 0) {
        println("Value of i: " + i)
      }
    }}}

    This will print
    {{{
      Value of i: 2
      Value of i: 4
      Value of i: 6
      Value of i: 8
      Value of i: 10
    }}}

    Instead of the ... to ... syntax, Lists and other data structures can be
    traversed as well
    {{{
      for (i <- List("This", "is", "Scala", "!")) {
        ...
      }
    }}}

    For-loops can also produce a result with the yield keyword. The result of
    the body is then returned for each iteration.

    */
  def simpleForWithYield(res0: String, res1: String, res2: String, res3: String) {
    val result =
      for (i <- List("This", "is", "Scala", "!")) yield {
        i.toUpperCase
      }

    result should be(List(res0, res1, res2, res3))
  }
}
