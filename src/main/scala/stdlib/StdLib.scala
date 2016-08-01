/*
 * scala-exercises-content
 * Copyright (C) 2015-2016 47 Degrees, LLC. <http://www.47deg.com>
 */

package stdlib

/** Exercises for the /ch/open Scala Workshop.
  *
  * @param name Scala_Workshop
  */
object StdLib extends org.scalaexercises.definitions.Library {
  override def owner = "misto"
  override def repository = "exercises-stdlib"

  override def color = Some("#26525B")

  override def sections = List(
    Asserts,
    ValAndVar,
    LiteralBooleans,
    Lists,
    Tuples,
    PatternMatching,
    CaseClasses,
    Sets,
    Maps,
    Ranges,
    Options,
    HigherOrderFunctions,
    Traversables,
    Iterables,
    SequencesandArrays,
    PartiallyAppliedFunctions
  )
}
