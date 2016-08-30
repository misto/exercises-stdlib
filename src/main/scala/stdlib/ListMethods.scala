package stdlib

import org.scalatest._

/** @param name list_methods
  *
  */
object ListMethods extends FlatSpec with Matchers with org.scalaexercises.definitions.Section {

  /** Scala Lists have many useful methods
    */
  def usefulMethodsLists(res0: Int, res1: List[Int], res2: List[Int], res3: List[Int]) {
    val a = List(1, 3, 5, 7, 9)

    // get the length of the list
    a.length should equal(res0)

    // reverse the list
    a.reverse should equal(res1)

    // map a function to double the numbers over the list
    a.map { v => v * 2 } should equal(res2)

    // filter any values divisible by 3 in the list
    a.filter { v => v % 3 == 0 } should equal(res3)
  }

  /** Functions over lists can use _ as shorthand
    */
  def wildcardAsShorthandLists(res0: Int, res1: Int, res2: Int, res3: Int) {
    val a = List(1, 2, 3)

    a.map {
      _ * 2
    } should equal(List(res0, res1, res2))

    a.filter {
      _ % 2 == 0
    } should equal(List(res3))
  }

  /** Functions over lists can use `()` instead of `{}`
    */
  def functionsOverListsLists(res0: Int, res1: Int, res2: Int, res3: Int, res4: Int) {
    val a = List(1, 2, 3)
    a.map(_ * 2) should equal(List(res0, res1, res2))
    a.filter(_ % 2 != 0) should equal(List(res3, res4))
  }

  /** Lists can be *reduced* with a mathematical operation
    */
  def reducingListsLists(res0: Int, res1: Int) {
    val a = List(1, 3, 5, 7)
    a.reduceLeft(_ + _) should equal(res0)
    a.reduceLeft(_ * _) should equal(res1)
  }

  /** Foldleft is like reduce, but with an explicit starting value
    */
  def foldLeftLists(res0: Int, res1: Int, res2: Int, res3: Int) {
    val a = List(1, 3, 5, 7)
    // NOTE: foldLeft uses a form called currying that we will explore later
    a.foldLeft(0)(_ + _) should equal(res0)
    a.foldLeft(10)(_ + _) should equal(res1)
    a.foldLeft(1)(_ * _) should equal(res2)
    a.foldLeft(0)(_ * _) should equal(res3)
  }
}
