package com.rana.math

import com.twitter.finagle.Thrift
import com.twitter.util.{Await, Future}

/**
  * Created by rana on 24/2/17.
  */
object CalculatorClient extends App {
  val client = Thrift.client.withBufferedTransport.newIface[Calculator[Future]]("localhost:9090")

  println("Addition: " + Await.result(client.add(20, 10)))
  println("Subtraction: " + Await.result(client.sub(20, 10)))
  println("Multiplication: " + Await.result(client.mult(20, 10)))
  println("Division: " + Await.result(client.div(20, 10)))
  println("Display test...")

  client.display("This is a text string!!")

  val data = client.getStudent(10)
  data.onSuccess(s => {
    println("Student data: " + s.toTuple.toString())
  })
  val res = Await.result(data).toTuple.toString()
  println("Student data: " + res)

  client.printText("No way...")
}