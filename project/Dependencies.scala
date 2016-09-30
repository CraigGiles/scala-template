import sbt._
import Keys._

object Dependencies {

  val core = Seq(
    "org.typelevel" %% "cats" % "0.7.2")

  val test = Seq(
    "org.scalatest" %% "scalatest" % "2.2.6" % "test")

  val database = Seq(
    "mysql" % "mysql-connector-java" % "5.1.36")

  val frontend = core ++ Seq()

  val backend = core ++ database ++ Seq()

}
