package com.rana.math

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Future, Promise}
import scala.util.{Failure, Success}

/**
  * Created by rana on 28/2/17.
  */
object ConcurrencyTest extends App {
  val future = Promiser.makePromise("This is a election promise!!")

  future.onComplete{
    case Success(value : String) => println("Future result: " + value)
    case Failure(ex) => println("Failure case...");ex.printStackTrace()
  }

  future.onSuccess{
    case value : String => println("Future value: " + value)
  }

  Thread.sleep(1000)
}

object Promiser {
  def makePromise(value : String) : Future[String] = {
    Promise[String]().success(value).future
  }
}
