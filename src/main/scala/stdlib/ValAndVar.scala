package stdlib

import org.scalatest._

/** @param name Val_and_Var
  *
  */
object ValAndVar extends FlatSpec with Matchers with org.scalaexercises.definitions.Section {

  /** In Scala, there are two ways to declare a variable: using the val or var keywords.
    *
    * A variable defined as val is equal to a final variable in Java.
    */
  def helloWorldVal(res0: String) {
    val message = "Hello World"
    message shouldBe res0
  }

  /** You are allowed to put semicolons at the end of a line, but it's neither
    * recommended nor necessary:
    *
    * {{{
    * val message = "Works as well";
    * }}}
    *
    * Most Scala constructs are expressions and can be assigned to a  ```val```
    */
  def isItWeekend(res0: Boolean) {
    import java.time._
    val today = LocalDate.now
    val dow = today.getDayOfWeek
    val isWeekend = {
      if(dow == DayOfWeek.SATURDAY || dow == DayOfWeek.SUNDAY) {
        true
      } else {
        false
      }
    }
    isWeekend shouldBe res0
  }

  /** Types are inferred from the tight-hand side of the assignment, but for
    * clarity they can also be specified:
    */
  def valWithTypeAscription(res0: Int) {
    val year: Int = 2016
    year shouldBe res0
  }

  /** Finally, vars are just like vals but they can also be re-assigned:
    */
  def var_0(res0: String, res1: String) {
    var message = "Hello World"
    message shouldBe res0
    message = "Hello /ch/open"
    message shouldBe res1
  }
}
