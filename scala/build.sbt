name := "thrift-scala-test"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.apache.thrift" % "libthrift" % "0.9.3",
  "com.twitter" % "scrooge-core_2.11" % "4.14.0" exclude("com.twitter", "libthrift"),
  "com.twitter" % "finagle-thrift_2.11" % "6.42.0" exclude("com.twitter", "libthrift")
)

scroogeThriftSourceFolder := file("src/main/thrift")
scroogeThriftOutputFolder := file("target/scala-2.11/src_managed")
