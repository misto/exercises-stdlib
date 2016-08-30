package stdlib

import org.scalatest._

/** @param name introduction
  */
object Asserts extends FlatSpec with Matchers with org.scalaexercises.definitions.Section {

  /** Before we can start, we need a quick introduction to ScalaTest, the framework
    * that verifies your answers to the exercises.
    *
    * ScalaTest makes three assertions available by default in any style trait. You can use:
    *
    *  - `assert` for general assertions;
    *  - `assertResult` to differentiate expected from actual values;
    *  - `intercept` to ensure a bit of code throws an expected exception.
    *
    * In any Scala program, you can write assertions by invoking `assert` and passing in a `Boolean` expression:
    *
    * {{{
    * val left = 2
    * val right = 1
    * assert(left == right)
    * }}}
    *
    * If the passed expression is `true`, `assert` will return normally. If `false`,
    * Scala's `assert` will complete abruptly with an `AssertionError`.
    *
    *
    * ScalaTest provides a domain specific language (DSL) for expressing assertions in tests
    * using the word `should`.
    *
    * {{{
    * result should be (3)
    * result shouldBe 3       // no parentheses required
    * result should equal(3)  // can customize equality
    * result shouldEqual 3    // can customize equality, no parentheses required
    * }}}
    *
    * Come on, your turn: true and false values can be compared with should matchers
    */
  def scalaTestAsserts(res0: Boolean) {
    true should be(res0)
  }

  /** Booleans in asserts can test equality.
    */
  def booleanAsserts(res0: Int) {
    val v1 = 4
    v1 shouldBe res0

    /** `shouldEqual` is an assertion. It is from ScalaTest, not from the Scala language. */
  }

  /** Sometimes we expect you to fill in the values
    */
  def valuesAsserts(res0: Int) {
    assert(res0 == 1 + 1)
  }

}
