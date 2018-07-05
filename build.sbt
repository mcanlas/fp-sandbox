lazy val root = Project("fp-sandbox", file("."))
  .settings(scalaVersion := "2.12.6")
  .aggregate(cats, mouse, catsEffect, scalaz)

lazy val cats = project
  .settings(scalaVersion := "2.12.6")
  .settings(libraryDependencies += "org.typelevel" %% "cats-core" % "1.1.0")

lazy val catsEffect = project
  .settings(scalaVersion := "2.12.6")
  .settings(libraryDependencies += "org.typelevel" %% "cats-effect" % "1.0.0-RC2")

lazy val mouse = project
  .settings(scalaVersion := "2.12.6")
  .settings(libraryDependencies += "org.typelevel" %% "mouse" % "0.17")

lazy val scalaz = project
  .settings(scalaVersion := "2.12.6")
  .settings(libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.25")
