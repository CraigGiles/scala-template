package com.gilesc

trait StackModule {
  type Stack = List[Int]

  def push(state: Stack, a: Int): (Stack, Unit) = (a :: state, ())

  def pop(state: Stack): (Stack, Int) = state match {
    case x :: xs => (xs, x)
    case Nil => sys.error("stack is empty")
  }

  def stackManip(state: Stack): (Stack, Int) = {
    val (s1, _) = push(state, 3)
    val (s2, a) = pop(s1)
    pop(s2)
  }
}

