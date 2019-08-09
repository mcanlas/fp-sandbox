lazy val root = Project("fp-sandbox", file("."))
  .settings(commonSettings: _*)
  .aggregate(cats, mouse, catsEffect, fs2, scalaz, zio)

lazy val cats = project
  .settings(commonSettings: _*)
  .settings(libraryDependencies += "org.typelevel" %% "cats-core" % "2.0.0-RC1")
  .settings(
    initialCommands in console := "import cats._, cats.data._, cats.implicits._")

lazy val catsEffect = project
  .settings(commonSettings: _*)
  .settings(libraryDependencies += "org.typelevel" %% "cats-effect" % "2.0.0-RC1")
  .settings(
    initialCommands in console := "import cats._, cats.data._, cats.implicits._, cats.effect._")

lazy val fs2 = project
  .settings(commonSettings: _*)
  .settings(libraryDependencies += "co.fs2" %% "fs2-core" % "1.1.0-M1")
  .settings(
    initialCommands in console := "import cats._, cats.data._, cats.implicits._")

lazy val mouse = project
  .settings(commonSettings: _*)
  .settings(libraryDependencies += "org.typelevel" %% "mouse" % "0.22")
  .settings(
    initialCommands in console := "import cats._, cats.data._, cats.implicits._, mouse.all._")

lazy val scalaz = project
  .settings(commonSettings: _*)
  .settings(libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.28")
  .settings(initialCommands in console := "import scalaz._, Scalaz._")

lazy val zio = project
  .settings(commonSettings: _*)
  .settings(libraryDependencies += "dev.zio" %% "zio" % "1.0.0-RC10-1")

scalafmtOnCompile := true

lazy val commonSettings = Seq(
  scalaVersion := "2.13.0")
