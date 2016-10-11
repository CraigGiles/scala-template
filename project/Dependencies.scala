import sbt._
import Keys._

object Dependencies {
  def cats = "org.typelevel" %% "cats" % "0.7.2"
  def scalatest(scope: String) = "org.scalatest" %% "scalatest" % "2.2.6" % scope
  def mysqlConnectorJava = "mysql" % "mysql-connector-java" % "5.1.36"
}
