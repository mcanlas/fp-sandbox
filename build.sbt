lazy val root = Project("fp-sandbox", file("."))
  .aggregate(cats, mouse, catsEffect, fs2, scalaz, zio, refined, circe)

lazy val cats = project
  .settings(libraryDependencies += "org.typelevel" %% "cats-core" % "2.1.0")
  .settings(initialCommands in console := "import cats._, cats.data._, cats.implicits._")

lazy val catsEffect = project
  .settings(libraryDependencies += "org.typelevel" %% "cats-effect" % "2.1.1")
  .settings(initialCommands in console := "import cats._, cats.data._, cats.implicits._, cats.effect._")

lazy val fs2 = project
  .settings(libraryDependencies += "co.fs2" %% "fs2-core" % "2.0.0")
  .settings(initialCommands in console := "import cats._, cats.data._, cats.implicits._")

lazy val mouse = project
  .settings(libraryDependencies += "org.typelevel" %% "mouse" % "0.24")
  .settings(initialCommands in console := "import cats._, cats.data._, cats.implicits._, mouse.all._")

lazy val scalaz = project
  .settings(commonSettings: _*)
  .settings(libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.29")
  .settings(initialCommands in console := "import scalaz._, Scalaz._")

lazy val zio = project
  .settings(libraryDependencies += "dev.zio" %% "zio" % "1.0.0-RC12-1")

lazy val refined = project
  .settings(libraryDependencies += "eu.timepit" %% "refined" % "0.9.10")

lazy val circe = project
  .settings(libraryDependencies +=  "io.circe" %% "circe-core" % "0.13.0")

scalafmtOnCompile := true

lazy val commonSettings = Seq(scalaVersion := "2.13.1")
