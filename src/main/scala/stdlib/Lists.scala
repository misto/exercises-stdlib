package stdlib

import org.scalatest._

/** @param name lists
  *
  */
object Lists extends FlatSpec with Matchers with org.scalaexercises.definitions.Section {

  /** Scala Lists are quite similar to arrays which means, all the elements of a list have the same
    * type but there are two important differences. First, lists are immutable, which means elements
    * of a list cannot be changed by assignment. Second, lists represent a linked list whereas arrays
    * are flat.
    *
    * Lists are easily created
    */
  def easilyCreatedLists(res0: Int, res1: Int, res2: Int) {
    val a = List(1, 2, 3)
    a should equal(List(res0, res1, res2))
  }

  /** Lists can be accessed via head, headOption and tail.
    * Accessing List via `head` is unsafe and may result in a IndexOutOfBoundsException
    */
  def headAndTailLists(res0: Int, res1: Int, res2: Int) {
    val a = List(1, 2, 3)
    a.headOption should equal(Option(res0))
    a.tail should equal(List(res1, res2))
  }

  /** Lists can be accessed by position
    */
  def byPositionLists(res0: Int, res1: Int, res2: Int) {
    val a = List(1, 3, 5, 7, 9)
    a(0) should equal(res0)
    a(2) should equal(res1)
    a(4) should equal(res2)

    intercept[IndexOutOfBoundsException] {
      println(a(5))
    }
  }

  /** Lists are immutable
    */
  def areImmutableLists(res0: Int, res1: Int, res2: Int, res3: Int) {
    val a = List(1, 3, 5, 7, 9)
    val b = a.filterNot(v => v == 5) // remove where value is 5

    a should equal(List(1, 3, 5, 7, 9))
    b should equal(List(res0, res1, res2, res3))
  }

  /** You can create a list from a range
    */
  def fromRangeLists(res0: List[Int]) {
    val a = (1 to 5).toList
    a should be(res0)
  }

  /** Lists reuse their tails
    */
  def reuseTailsLists(res0: Int, res1: Int, res2: Int, res3: List[Int], res4: List[Int], res5: List[Int]) {
    val d = Nil
    val c = 3 :: d
    val b = 2 :: c
    val a = 1 :: b

    a should be(List(res0, res1, res2))
    a.tail should be(res3)
    b.tail should be(res4)
    c.tail should be(res5)
  }

  /**
  * `eq` tests identity (same object)
  */
  def similarToArraysLists(res0: Boolean) {
    val a = List(1, 2, 3)
    val b = List(1, 2, 3)
    (a eq b) should be(res0)
  }

  /** `==` tests equality (same content)
  */
  def sameContentLists(res0: Boolean) {
    val a = List(1, 2, 3)
    val b = List(1, 2, 3)
    (a == b) should be(res0)
  }

  /** Nil lists are identical, even of different types
  */
  def nilListsLists(res0: Boolean, res1: Boolean, res2: Boolean, res3: Boolean, res4: Boolean, res5: Boolean) {
    val a: List[String] = Nil
    val b: List[Int] = Nil

    (a == Nil) should be(res0)
    (a eq Nil) should be(res1)

    (b == Nil) should be(res2)
    (b eq Nil) should be(res3)

    (a == b) should be(res4)
    (a eq b) should be(res5)
  }
}
