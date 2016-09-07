import sbt._
import Keys._

object Dependencies {
  val database = Seq(
    "mysql" % "mysql-connector-java" % "5.1.36"
  )
  val core = Seq(
    "org.typelevel" %% "cats" % "0.6.0"
  )

  val test = Seq(
    "org.scalatest" %% "scalatest" % "2.2.6" % "test"
  )

}
