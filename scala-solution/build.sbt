ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "scala-algorithm-coding-challenge",
    libraryDependencies ++= Seq(
      "org.scalactic" %% "scalactic" % "3.2.16",
      "org.scalatest" %% "scalatest" % "3.2.16" % "test"
    )
  )
