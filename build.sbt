lazy val root = Project("fp-sandbox", file("."))
  .settings(scalaVersion := "2.12.6")
  .aggregate(cats, mouse, catsEffect, scalaz, scalazEffect)

lazy val cats = project
  .settings(scalaVersion := "2.12.6")
  .settings(libraryDependencies += "org.typelevel" %% "cats-core" % "1.2.0")
  .settings(initialCommands in console := "import cats._, cats.data._, cats.implicits._")

lazy val catsEffect = project
  .settings(scalaVersion := "2.12.6")
  .settings(libraryDependencies += "org.typelevel" %% "cats-effect" % "1.0.0-RC2")
  .settings(initialCommands in console := "import cats._, cats.data._, cats.implicits._")

lazy val mouse = project
  .settings(scalaVersion := "2.12.6")
  .settings(libraryDependencies += "org.typelevel" %% "mouse" % "0.18")
  .settings(initialCommands in console := "import cats._, cats.data._, cats.implicits._, mouse.all._")

lazy val scalaz = project
  .settings(scalaVersion := "2.12.6")
  .settings(libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.25")
  .settings(initialCommands in console := "import scalaz._, Scalaz._")

lazy val scalazEffect = project
  .settings(scalaVersion := "2.12.6")
  .settings(libraryDependencies += "org.scalaz" %% "scalaz-ioeffect" % "2.10.1")
  .settings(initialCommands in console := "import scalaz._, Scalaz._")
