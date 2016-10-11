import Dependencies._

val commonSettings = Seq(
  organization in ThisBuild := "com.gilesc",
  version in ThisBuild := "0.0.1",
  scalaVersion in ThisBuild := "2.11.8",
  scalacOptions in ThisBuild  := Seq(
    "-encoding", "UTF-8",
    "-deprecation",
    "-feature",
    "-language:_",
    "-unchecked",
    "-Ydelambdafy:method",
    "-Yno-adapted-args",
    "-Ywarn-numeric-widen",
    "-Xfuture",
    "-Ybackend:GenBCode",
    "-Yopt:l:classpath"
  )

  // resolvers ++= Seq()
)

lazy val rootProject = (project in file("."))
  .settings(commonSettings: _*)
  .settings(
    name := "My Project Name",
    aggregate in update := false)

lazy val flyway = (project in file("flyway"))
  .enablePlugins(FlywayPlugin)
  .settings(
    libraryDependencies ++= Seq(
      flywayCore,
      mysqlConnectorJava
    )
  )

lazy val backend = Project("backend", file("backend"))
  .settings(commonSettings: _*)
  .settings(
    libraryDependencies ++= Seq(
      cats, scalatest("test")
    )
  )

lazy val presentation = Project("presentation", file("presentation"))
  .settings(commonSettings: _*)
  .enablePlugins(play.PlayScala)
  .dependsOn(backend % "compile->compile")
  .settings(
    libraryDependencies ++= Seq(
      cats,
      scalatest("test"),
      mysqlConnectorJava)
  )
