lazy val root = Project("fp-sandbox", file("."))
  .settings(commonSettings: _*)
  .aggregate(cats, mouse, catsEffect, fs2, scalaz, scalazEffect, zio)

lazy val cats = project
  .settings(commonSettings: _*)
  .settings(libraryDependencies += "org.typelevel" %% "cats-core" % "1.6.0")
  .settings(
    scalacOptions += "-Ypartial-unification",
    initialCommands in console := "import cats._, cats.data._, cats.implicits._")

lazy val catsEffect = project
  .settings(commonSettings: _*)
  .settings(libraryDependencies += "org.typelevel" %% "cats-effect" % "1.3.0")
  .settings(
    scalacOptions += "-Ypartial-unification",
    initialCommands in console := "import cats._, cats.data._, cats.implicits._, cats.effect._")

lazy val fs2 = project
  .settings(commonSettings: _*)
  .settings(libraryDependencies += "co.fs2" %% "fs2-core" % "1.0.4")
  .settings(
    scalacOptions += "-Ypartial-unification",
    initialCommands in console := "import cats._, cats.data._, cats.implicits._")

lazy val mouse = project
  .settings(commonSettings: _*)
  .settings(libraryDependencies += "org.typelevel" %% "mouse" % "0.21")
  .settings(
    scalacOptions += "-Ypartial-unification",
    initialCommands in console := "import cats._, cats.data._, cats.implicits._, mouse.all._")

lazy val scalaz = project
  .settings(commonSettings: _*)
  .settings(libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.27")
  .settings(initialCommands in console := "import scalaz._, Scalaz._")

lazy val scalazEffect = project
  .settings(commonSettings: _*)
  .settings(libraryDependencies += "org.scalaz" %% "scalaz-ioeffect" % "2.10.1")
  .settings(initialCommands in console := "import scalaz._, Scalaz._")

lazy val zio = project
  .settings(commonSettings: _*)
  .settings(libraryDependencies += "org.scalaz" %% "scalaz-zio" % "1.0-RC4")

scalafmtOnCompile := true

lazy val commonSettings = Seq(
  scalaVersion := "2.12.8")
