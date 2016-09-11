
val commonSettings = Seq(
  organization := "com.gilesc",
  version := "0.0.1",
  scalaVersion := "2.11.8",
  scalacOptions := Seq(
    "-unchecked"
  ))

lazy val rootProject = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "My Project Name",
    aggregate in update := false)

lazy val flyway = (project in file("flyway")).
  enablePlugins(FlywayPlugin).
  settings(
    libraryDependencies ++= Dependencies.database)

lazy val backend = Project("backend", file("backend")).
  settings(commonSettings: _*).
  settings(
    libraryDependencies ++= Dependencies.backend)

lazy val presentation = Project("presentation", file("presentation")).
  settings(commonSettings: _*).
  enablePlugins(play.PlayScala).
  dependsOn(backend % "compile->compile").
  settings(
    libraryDependencies ++= Dependencies.frontend)

javaOptions in Universal ++= Seq(
  "-J-Xmx1024m",
  "-J-Xms512m")
