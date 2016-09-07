package com.gilesc

object Main extends App with StackModule {
  println("Hello World")

  val asdf = pop(List(5, 8, 2, 1))
  println("Stack: " + pop(asdf._1))
}
