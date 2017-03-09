package com.rana.math

import com.twitter.util.Future

/**
  * Created by rana on 24/2/17.
  */
class ThriftServer extends Calculator[Future] {
  override def add(a: Int, b: Int): Future[Int] = {
    println("Addition method is called!!")
    return Future(a+b);
  }

  override def sub(a: Int, b: Int): Future[Int] = {
    println("Subtraction method is called!!")
    return Future(a-b);
  }

  override def mult(a: Int, b: Int): Future[Int] = {
    println("Multiplication method is called!!")
    return Future(a*b);
  }

  override def div(a: Int, b: Int): Future[Int] = {
    println("Division method is called!!")
    return Future(a/b);
  }

  override def display(text: String): Future[Unit] = {
    println("Just to remove the compiler errors!!")
    Future[Unit]()
  }

  override def getStudent(id: Int): Future[Student] = {
    println("Just to remove the compiler errors!!")
    val stud = new Student {override def dept: String = "CS"
      override def name: String = "Talina"
      override def id: Int = 1
    }
    Future[Student](stud)
  }

  override def printText(text: String): Future[Unit] = ???
}
