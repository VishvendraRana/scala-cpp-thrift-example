package com.rana.math

import com.twitter.finagle.Thrift
import com.twitter.util.Await

/**
  * Created by rana on 24/2/17.
  */
object ServiceStarter extends App{
  val service = Thrift.server.serveIface("localhost:9090", new ThriftServer)
  Await.result(service)
}
